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

import static Calculus.MathematicalTestHarness.DevelopmentDeepInfoLambdaFlag;
import static Calculus.MathematicalTestHarness.GBLSilentDeepInfoLambda;
import static Calculus.MathematicalTestHarness.MarianaTrenchReasoningLambdaFlag;
import static Calculus.MathsContxtLAv.LAConstComplexMapFlag;
import static Calculus.MathsContxtLAv.LAConstSimpleMapFlag;
import static Calculus.MathsContxtLAv.LADyYByDxMAPOperator;
import static Calculus.MathsContxtLAv.LAIndConstOperator;
import static Calculus.MathsContxtLAv.LAMAPOperator;
import static Calculus.MathsContxtLAv.LAPreIndConstOperator;
import static Calculus.MathsContxtLAv.LAPreTermOperator;
import static Calculus.MathsContxtLAv.LATermOperator;
import static Calculus.MathsContxtLAv.LATermOperatorBraces;
import static Calculus.MathsContxtLAv.LAVarComplexMapFlag;
import static Calculus.MathsContxtLAv.LAVarSimpleMapFlag;
import static Calculus.MathsContxtLAv.LAVarTermOperator;
import static Calculus.MathsContxtLAv.TrailConstantFlag;
import static Calculus.MathsContxtLAv.TrailConstantOperator;
import static Calculus.MathsContxtLAv.log;
import static Calculus.MathsContxtLAv.parseReasonOper;
import static Calculus.UsageCalculus.Order;
import static Calculus.UsageCalculus.StageMapping;
import static Calculus.UsageCalculus.TestCase;
import org.apache.log4j.Logger;

/**
 *
 * @author pai_c
 */
public class LookAheadOperAI {
     public static Logger log = Logger.getLogger(LookAheadOperAI.class.getName());
    @FunctionalInterface
    public interface OperatorLambda {

        int Operator();
    }

    public static OperatorLambda parseOper(String MapType, String IntegrORDiffr, String AlgoName, String str, int LastOper, String CompleteStr, String IndConstStr, String BracesStr, String VarStr, String ConstStr, String DiffWithRespTo, boolean BracesFlag, boolean VariableFlag, boolean ConstantFlag, boolean IndConstFlag, int NullOperator) {
        return new Object() {

            OperatorLambda parseOper() {
                OperatorLambda x = (() -> '*');
                if ((str.equalsIgnoreCase("PreLAIndConstOperator"))
                        && (IndConstFlag == true) && (!IndConstStr.equalsIgnoreCase(""))) {
                    x = parsePreIndConstant();
                    log.info("OperatorLambda:parseOper:IndConstantRules:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseOper:parseIndConstant:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((str.equalsIgnoreCase("LAIndConstOperator"))
                        && (IndConstFlag == true) && (!IndConstStr.equalsIgnoreCase(""))) {
                    x = parseIndConstant();
                    log.info("OperatorLambda:parseOper:IndConstantRules:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseOper:parseIndConstant:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((str.equalsIgnoreCase("PreConstOperator"))
                        && (ConstantFlag == true) && (!ConstStr.equalsIgnoreCase(""))) {
                    x = parsePreConstant();
                    log.info("OperatorLambda:parseOper:PreConstantRules:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseOper:parsePreConstant:parsePreConstant:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((str.equalsIgnoreCase("PreVarOperator"))
                        && (VariableFlag == true) && (!VarStr.equalsIgnoreCase(""))) {
                    x = parsePreVar();
                    log.info("OperatorLambda:parseOper:parsePreVar:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseOper:parsePreVar:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                }
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parseOper:Final:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                }
                return x;
            }
            OperatorLambda parsePreIndConstant() {
                OperatorLambda x = (() -> '*');
                if (LAPreIndConstOperator == '/') {
                    if (IndConstStr.startsWith("1.0")) {
                        x = (() -> LAIndConstOperator);
                    } else {
                        x = (() -> LAIndConstOperator);
                    }
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule1:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule1:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if (((LAIndConstOperator == '*') && (LATermOperator == -1)) || ((LAPreTermOperator == -1) && (IndConstFlag == true))) {
                    x = (() -> LAIndConstOperator);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule2:x.Operator()=" + (char) x.Operator());
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule2:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LATermOperator == -1) && (LAPreTermOperator == '*')) {
                    x = (() -> LAPreTermOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule3:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule3:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LATermOperator == -1) && (LAPreIndConstOperator == '/')) {
                    x = (() -> '*');
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:Map:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:Map:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LAPreIndConstOperator == '/')) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LAPreIndConstOperator == '*')) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if (LAPreIndConstOperator == -1) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else {
                    x = (() -> LATermOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                }
                log.info("OperatorLambda:parseIndConstant:Final:x.Operator()=" + (char) x.Operator());
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parseIndConstant:Final:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                }
                return x;
            }
            OperatorLambda parseIndConstant() {
                OperatorLambda x = (() -> '*');
                if (LAPreIndConstOperator == '/') {
                    if (IndConstStr.startsWith("1.0")) {
                        x = (() -> LAIndConstOperator);
                    } else {
                        x = (() -> LAIndConstOperator);
                    }
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule1:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule1:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if (((LAIndConstOperator == '*') && (LATermOperator == -1)) || ((LAPreTermOperator == -1) && (IndConstFlag == true))) {
                    x = (() -> LAIndConstOperator);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule2:x.Operator()=" + (char) x.Operator());
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule2:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LATermOperator == -1) && (LAPreTermOperator == '*')) {
                    x = (() -> LAPreTermOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule3:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule3:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LATermOperator == -1) && (LAPreIndConstOperator == '/')) {
                    x = (() -> '*');
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:Map:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.1:Map:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LAPreIndConstOperator == '/')) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.2:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if ((LAIndConstOperator == '/') && (LAPreIndConstOperator == '*')) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.3:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else if (LAPreIndConstOperator == -1) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.5:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                } else {
                    x = (() -> LATermOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parseIndConstant:IndConstantRules:Rule4.6:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                    }
                }
                log.info("OperatorLambda:parseIndConstant:Final:x.Operator()=" + (char) x.Operator());
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parseIndConstant:Final:x.Operator()=" + (char) x.Operator() + " LAPreIndConstOperator=" + (char) LAPreIndConstOperator);
                }
                return x;
            }

            OperatorLambda parsePreConstant() {
                OperatorLambda x = (() -> '*');
                boolean DivMapFlag = false;
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parsePreConstant:Initial:x.Operator()=" + (char) x.Operator());
                }
                if ((LATermOperator != LAVarTermOperator) && (LATermOperator != -1) && (LAVarTermOperator != -1)) {
                    if (VarStr.equalsIgnoreCase("1.0")) {
                        x = (() -> LAVarTermOperator);
                    } else {
                        x = (() -> LAVarTermOperator);
                    }
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.3::x.Operator()=" + (char) x.Operator());
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.3::x.Operator()=" + (char) x.Operator());
                    }
                } else if ((LATermOperator == LAVarTermOperator) && (LATermOperator != -1) && (LAVarTermOperator != -1) && (LAIndConstOperator == '/')) {
                    x = (() -> LAIndConstOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.1:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.1:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((LATermOperator == LAVarTermOperator) && (LATermOperator != -1) && (LAVarTermOperator != -1)) {
                    if (VarStr.equalsIgnoreCase("1.0")) {
                        x = (() -> LATermOperator);
                    } else {
                        x = (() -> LATermOperator);
                    }
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.2:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.4.2:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((LATermOperator == -1) && (TrailConstantFlag == true) && (TrailConstantOperator == '*')) {
                    if (VarStr.equalsIgnoreCase("1.0")) {
                        x = (() -> TrailConstantOperator);
                    } else {
                        x = (() -> TrailConstantOperator);
                    }
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.5:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.5:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((LATermOperator == -1) && (TrailConstantFlag == true) && (TrailConstantOperator == '/')) {
                    // COMMENT:BE CAREFUL OF ROUNDING UP OF DOUBLE
                    if (CompleteStr.endsWith("/")) {
                        x = (() -> '/');
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.1:x.Operator()=" + (char) x.Operator());
                    } else if (CompleteStr.endsWith("*")) {
                        x = (() -> '*');
                        DivMapFlag = true;
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.2:x.Operator()=" + (char) x.Operator());
                    } else if (!CompleteStr.equalsIgnoreCase("")) {
                        x = (() -> '/');
                        //DivMapFlag = true;
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.3:x.Operator()=" + (char) x.Operator());
                    } else if ((CompleteStr.equalsIgnoreCase("")) && (VarStr.equalsIgnoreCase("1.0"))) {
                        x = (() -> '/');
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.4:x.Operator()=" + (char) x.Operator());
                    } else {
                        x = (() -> '/');
                        DivMapFlag = true;
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.5:x.Operator()=" + (char) x.Operator());
                    }
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (((LAPreTermOperator == '/') && (LAConstSimpleMapFlag == true) && (LATermOperator == -1)) || ((LAVarSimpleMapFlag == false) && (LAMAPOperator == '/')))) {
                    x = (() -> '/');
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.6:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.6:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (LAPreTermOperator == '/') && (LAVarSimpleMapFlag == false) && (LATermOperator == -1)) {
                    x = (() -> '/');
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.7:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.7:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.7:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (LAPreTermOperator == '/') && (LAVarSimpleMapFlag == false)) {
                    x = (() -> NullOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.8:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.8:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.8:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (IndConstStr.equalsIgnoreCase(""))) {
                    x = (() -> NullOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.9:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.9:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.9:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (!IndConstStr.equalsIgnoreCase("")) && (LAPreIndConstOperator != -1) && (LAPreIndConstOperator == '*') && (LAIndConstOperator != '*')) {
                    x = (() -> LAIndConstOperator);
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.10:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.10:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.9:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((ConstantFlag == true) && (!ConstStr.equalsIgnoreCase("")) && (!IndConstStr.equalsIgnoreCase("")) && (LAPreIndConstOperator != -1) && (IndConstFlag == true)) {
                    if ((LAPreIndConstOperator == '*') || (LAPreIndConstOperator == '/')) {
                        x = (() -> LAPreIndConstOperator);
                    } else if ((LAVarTermOperator == '*') || (LAVarTermOperator == '/')) {
                        x = (() -> LAVarTermOperator);
                    } else {
                        x = (() -> '*');
                    }
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.11:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.11:x.Operator()=" + (char) x.Operator());
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.11:x.Operator()=" + (char) x.Operator());
                    }
                } else {
                    DivMapFlag = true;
                    if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                        System.out.println("OperatorLambda:parsePreConstant:VarConstantRules:Rule1.6.11:x.Operator()=" + (char) x.Operator());
                    }
                }
                if ((LastOper > 0) && (LastOper != x.Operator()) && (DivMapFlag == false) && (x.Operator() != NullOperator) && (LastOper != NullOperator)) {
                    int temp = x.Operator();
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "OperatorLambda:parsePreConstant:Unexpected LastOper: " + (char) LastOper + " NullOperator=" + (char) NullOperator + " int=" + (int) LastOper + " Pre and Post Operator Not Matching:" + (char) temp);
                }
                log.info("OperatorLambda:parsePreConstant:Final:x.Operator()=" + (char) x.Operator());
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parsePreConstant:Final:x.Operator()=" + (char) x.Operator());
                }
                return x;
            }

            OperatorLambda parseConstantPost() {
                OperatorLambda x = (() -> '*');

                return x;
            }

            OperatorLambda parsePreVar() {
                OperatorLambda x = (() -> '*');
                boolean DivMapFlag = false;
                if ((LATermOperator == -1) && (LAVarTermOperator != '/') && (VariableFlag == true) && (ConstantFlag == true)) {
                    //CompleteStr = CompleteStr + ConstStr + "*" + VarStr;
                    if ((LAMAPOperator == -1) && (LADyYByDxMAPOperator == -1)) {
                        x = (() -> '*');
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.7.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.7.1:x.Operator()=" + (char) x.Operator());
                    } else {
                        x = (() -> LAVarTermOperator);
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.7.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.7.2:x.Operator()=" + (char) x.Operator());
                    }
                    log.info("OperatorLambda:parsePreVar:VarConstantRules:Rule1.7:x.Operator()=" + (char) x.Operator());
                } else if ((LATermOperator == -1) && (LAVarTermOperator == '/') && (VariableFlag == true) && (ConstantFlag == true)) {
                    if ((LAMAPOperator == -1) && (LADyYByDxMAPOperator == -1)) {
                        if ((!ConstStr.equalsIgnoreCase("1.0")) && (LAVarTermOperator == '/')) {
                            x = (() -> '/');
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.2:x.Operator()=" + (char) x.Operator());
                        } else if ((!CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (LAVarTermOperator == '/')) {
                            x = (() -> LAVarTermOperator);
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.3:x.Operator()=" + (char) x.Operator());
                        } else if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (LAVarTermOperator == '/')) {
                            x = (() -> '/');
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.4:x.Operator()=" + (char) x.Operator());
                        } else if ((CompleteStr.equalsIgnoreCase("")) && (ConstStr.equalsIgnoreCase("1.0")) && (LAVarTermOperator == '/')) {
                            x = (() -> '*');
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.5:x.Operator()=" + (char) x.Operator());
                        } else {
                            x = (() -> NullOperator);
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8.6:x.Operator()=" + (char) x.Operator());
                        }

                        log.info("OperatorLambda:parsePreVar:VarConstantRules:Normal:Rule1.8:x.Operator()=" + (char) x.Operator());
                    } else {
                        if ((VarStr.startsWith("1.0")) && (ConstStr.equalsIgnoreCase("1.0"))) {
                            x = (() -> NullOperator);
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.9:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.9:x.Operator()=" + (char) x.Operator());
                        } else if (LAPreTermOperator != -1) {
                            String Temp = VarStr.replaceFirst("1.0", "");
                            if (Temp.startsWith("/")) {
                                x = (() -> LAPreTermOperator);
                                ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.10:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                                log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.10:x.Operator()=" + (char) x.Operator());
                            } else if (LAVarComplexMapFlag == true) {
                                x = (() -> '*');
                                ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.11:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                                log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.11:x.Operator()=" + (char) x.Operator());
                            } else if (LAVarSimpleMapFlag == true) {
                                x = (() -> LAVarTermOperator);
                                ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.11.1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                                log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.11.1:x.Operator()=" + (char) x.Operator());
                            } else {
                                x = (() -> LAPreTermOperator);
                                ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.12:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                                log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.12:x.Operator()=" + (char) x.Operator());
                            }
                        } else {
                            if (VarStr.startsWith("1.0")) {
                                String Temp = VarStr.replaceFirst("1.0", "");
                                x = (() -> NullOperator);
                            } else {
                                x = (() -> '/');
                            }
                            ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.13:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                            log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.13:x.Operator()=" + (char) x.Operator());
                        }
                        log.info("OperatorLambda:parsePreVar:VarConstantRules:MAP-:Rule1.9:x.Operator()=" + (char) x.Operator());
                    }
                } else if ((LATermOperator == -1) && (LAVarTermOperator == '*') && (VariableFlag == true) && (ConstantFlag == true)) {
                    if ((ConstStr.equalsIgnoreCase("1.0"))) {
                        x = (() -> NullOperator);
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:Normal:Rule1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                        log.info("OperatorLambda:parsePreVar:Normal:Rule1:x.Operator()=" + x.Operator());
                    }
                } else if ((TrailConstantFlag != true) && (VariableFlag == true) && (!VarStr.equalsIgnoreCase("")) && (!VarStr.equalsIgnoreCase("1.0")) && (!ConstStr.equalsIgnoreCase("0.0"))) {
                    log.info("OperatorLambda:parsePreVar:Normal Variable:Final:End Context:ConstStr=" + ConstStr + " TrailConstantOperator=" + (char) TrailConstantOperator + " VarStr=" + VarStr);
                    x = (() -> '*');
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreVar:End:Rule11.3:Final:x.Operator()=" + (char) x.Operator());
                } else if ((ConstantFlag == true) && (ConstStr.equalsIgnoreCase("0.0"))) {
                    x = (() -> NullOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreVar:End:Rule11.4:Final:x.Operator()=" + (char) x.Operator());
                } else if ((ConstantFlag == true) || ((VariableFlag == true) && ((LAPreTermOperator == '/') || (LAMAPOperator == '/')))) {
                    if ((VariableFlag == true) && (LAPreTermOperator == '/') && (LAVarSimpleMapFlag == false)) {
                        x = (() -> '*');
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    } else if ((VariableFlag == true) && (LAMAPOperator == '/') && (LAVarSimpleMapFlag == true)) {
                        x = (() -> LAMAPOperator);
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.6:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    } else if ((VariableFlag == true) && (LAMAPOperator == '*') && (LAVarSimpleMapFlag == true)) {
                        x = (() -> LAMAPOperator);
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.7:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    } else {
                        if (LAVarTermOperator == -1) {
                            LAVarTermOperator = '*';
                        }
                        x = (() -> LAVarTermOperator);
                        ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.8:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    }
                    log.info("OperatorLambda:parsePreVar:End:Rule11.5:Final:x.Operator()=" + (char) x.Operator());
                } else if (VariableFlag == true) {
                    x = (() -> NullOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parsePreVar:End:Rule11.5::", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parsePreVar:End:Rule11.5:Final:x.Operator()=" + (char) x.Operator());
                }
                log.info("OperatorLambda:parsePreVar:Final:x.Operator()=" + (char) x.Operator());
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parsePreVar:Final:x.Operator()=" + (char) x.Operator());
                }
                return x;
            }

            OperatorLambda parseBracesOper() {
                OperatorLambda x = (() -> '*');
                boolean DivMapFlag = false;
                if (((!CompleteStr.equalsIgnoreCase("1.0")) && ((LATermOperatorBraces == '*')))) {
                    x = (() -> LATermOperatorBraces);
                    DivMapFlag = true;
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 1:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 1:x.Operator()=" + (char) x.Operator());
                } else if (((!CompleteStr.equalsIgnoreCase("1.0")) || ((LATermOperatorBraces == '/')))) {
                    x = (() -> NullOperator);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 2:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 2:x.Operator()=" + (char) x.Operator());
                } else if (((!CompleteStr.equalsIgnoreCase("1.0")) || ((LATermOperatorBraces == '/')))) {
                    x = (() -> LATermOperatorBraces);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 3:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 3:x.Operator()=" + (char) x.Operator());
                } else if ((!CompleteStr.equalsIgnoreCase("1.0")) || ((LATermOperatorBraces == '/'))) {
                    x = (() -> LATermOperatorBraces);
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 4:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 4:x.Operator()=" + (char) x.Operator());
                } else if ((CompleteStr.equalsIgnoreCase("1.0")) && (LATermOperatorBraces == '*')) {
                    x = (() -> '*');
                    ReasoningLambdaOper z = parseReasonOper(MapType, IntegrORDiffr, AlgoName, str, "OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 5:", CompleteStr, IndConstStr, BracesStr, VarStr, ConstStr, DiffWithRespTo, BracesFlag, VariableFlag, ConstantFlag, IndConstFlag, NullOperator, x);
                    log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Rule 5:x.Operator()=" + (char) x.Operator());
                }
                if ((LastOper != x.Operator()) && (DivMapFlag == false) && (x.Operator() != NullOperator) && (LastOper != NullOperator)) {
                    int temp = x.Operator();
                    throw new RuntimeException(StageMapping + ":" + TestCase + ":Order=" + Order + "OperatorLambda:parsePreConstant:Unexpected LastOper: " + (char) LastOper + " int=" + (int) LastOper + " Pre and Post Operator Not Matching:" + (char) temp);
                }
                log.info("OperatorLambda:parseBracesOper:BraceStr Mapping:Final:x.Operator()=" + (char) x.Operator());
                if ((DevelopmentDeepInfoLambdaFlag) || (GBLSilentDeepInfoLambda.equalsIgnoreCase("Verbose"))) {
                    System.out.println("OperatorLambda:parseBracesOper:BraceStr Mapping:Final:x.Operator()=" + (char) x.Operator());
                }
                return x;
            }
        }.parseOper();
    }
@FunctionalInterface
    public interface ReasoningLambdaOper {

        String apply();
    }

    public static ReasoningLambdaOper parseReasonOper(String MapType, String IntegrORDiffr, String AlgoName, String str, String ActualRuleUsed, String CompleteStr, String IndConstStr, String BracesStr, String VarStr, String ConstStr, String DiffWithRespTo, boolean BracesFlag, boolean VariableFlag, boolean ConstantFlag, boolean IndConstFlag, int NullOperator, OperatorLambda z) {
        return new Object() {
            ReasoningLambdaOper Apply() {
                ReasoningLambdaOper x = () -> "";
                StringBuilder explanation = new StringBuilder("Reasoning Steps:");
                int i = 0;
                explanation.append("AlgoName=" + AlgoName + ":" + str);
                explanation.append(" MapType=" + MapType);
                explanation.append(" IntegrORDiffr=" + IntegrORDiffr + "\n");
                explanation.append(" ActualRuleUsed=" + ActualRuleUsed + "\n");

                explanation.append("Term" + i++ + ":IndConstFlag").append(":=").append(IndConstFlag).append("\n");
                explanation.append("Term" + i++ + ":IndConstStr").append(":=").append(IndConstStr).append("\n");
                explanation.append("Term" + i++ + ":BracesFlag").append(":=").append(BracesFlag).append("\n");
                explanation.append("Term" + i++ + ":BracesStr").append(":=").append(BracesStr).append("\n");
                explanation.append("Term" + i++ + ":VariableFlag").append(":=").append(VariableFlag).append("\n");
                explanation.append("Term" + i++ + ":VarStr").append(":=").append(VarStr).append("\n");
                explanation.append("Term" + i++ + ":ConstantFlag").append(":=").append(ConstantFlag).append("\n");
                explanation.append("Term" + i++ + ":ConstStr").append(":=").append(ConstStr).append("\n");
                explanation.append("Term" + i++ + ":NullOperator").append(":=").append(NullOperator).append("\n");

                i = 0;
                explanation.append("Term" + i++ + ":TrailConstantFlag").append(":=").append(TrailConstantFlag).append("\n");
                explanation.append("Term" + i++ + ":TrailConstantOperator").append(":=").append((char) TrailConstantOperator).append("\n");
                explanation.append("Term" + i++ + ":LATermOperator").append(":=").append((char) LATermOperator).append("\n");
                explanation.append("Term" + i++ + ":LATermOperatorBraces").append(":=").append((char) LATermOperatorBraces).append("\n");
                explanation.append("Term" + i++ + ":LAPreIndConstOperator").append(":=").append((char) LAPreIndConstOperator).append("\n");
                explanation.append("Term" + i++ + ":LAIndConstOperator").append(":=").append((char) LAIndConstOperator).append("\n");
                explanation.append("Term" + i++ + ":LAVarTermOperator").append(":=").append((char) LAVarTermOperator).append("\n");
                explanation.append("Term" + i++ + ":LAPreTermOperator").append(":=").append((char) LAPreTermOperator).append("\n");
                explanation.append("Term" + i++ + ":LATermOperator").append(":=").append((char) LATermOperator).append("\n");

                explanation.append("Term" + i++ + ":LAMAPOperator").append(":=").append((char) LAMAPOperator).append("\n");
                explanation.append("Term" + i++ + ":LADyYByDxMAPOperator").append(":=").append((char) LADyYByDxMAPOperator).append("\n");
                explanation.append("Term" + i++ + ":LAConstSimpleMapFlag").append(":=").append(LAConstSimpleMapFlag).append("\n");
                explanation.append("Term" + i++ + ":LAConstComplexMapFlag").append(":=").append(LAConstComplexMapFlag).append("\n");
                explanation.append("Term" + i++ + ":LAVarSimpleMapFlag").append(":=").append(LAVarSimpleMapFlag).append("\n");
                explanation.append("Term" + i++ + ":LAVarComplexMapFlag").append(":=").append(LAVarComplexMapFlag).append("\n");

                explanation.append("Final Operator=" + z.Operator() + "\n");
                x = () -> (explanation.toString());
                if (MarianaTrenchReasoningLambdaFlag) {
                    System.out.println(x.apply());
                }
                return x;
            }
        }.Apply();
    }

}
