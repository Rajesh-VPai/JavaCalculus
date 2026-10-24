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

import static Calculus.DiffrIntegrSep.MyFuncDiff;
import static Calculus.DiffrIntegrSep.MyFuncIntegr;
import static Calculus.MathematicalTestHarness.AITestResultsGenFlag;
import static Calculus.MathematicalTestHarness.GBLMyLogLevel;
import static Calculus.MathematicalTestHarness.GBLSilent;
import static Calculus.MathematicalTestHarness.HideInRecurseFlag;
import static Calculus.MathematicalTestHarness.SetDevFlags;
import static Calculus.MathematicalTestHarness.SetDevFlagsAI;
import static Calculus.MathematicalTestHarness.TestCaseFailCoarseReportingFlag;
import static Calculus.MathematicalTestHarness.Trace;
import static Calculus.MathsContxtLAv.ChaosPrevention;
import static Calculus.MathsContxtLAv.MyFuncExpress;
import static Calculus.MathsContxtLAv.MyFuncSimple;
import static Calculus.MathsExpressionParser.eatAll;
import static Calculus.MathsContxtLAv.parseSimple;
import static Calculus.MathsExpressionParser.parse;
import static Calculus.RuleAnalytics.sortedTestCases;
import static Calculus.TestHarnessClass.ConformalMapTestCaseDiff;
import static Calculus.TestHarnessClass.ConformalMapTestCaseIntegr;
import static Calculus.TestHarnessClass.FailTestCaseStringDiagnostic;
import static Calculus.TestHarnessClass.PassFailTestCaseString;
import static Calculus.TestHarnessClass.PassFailTestCaseValueStrict;
import static Calculus.UsageCalculus.AIDiffSingleHighTestCase;
import static Calculus.UsageCalculus.AIIntegralHighSingleTest;
import static Calculus.UsageCalculus.ByPassed;
import static Calculus.UsageCalculus.ByPassedTestCases;
import static Calculus.UsageCalculus.CoreKnownIssues;
import static Calculus.UsageCalculus.CoreKnownIssuesTestCasesFlag;
import static Calculus.UsageCalculus.DiffWithRespTo;
import static Calculus.UsageCalculus.DupChecknInsert;
import static Calculus.UsageCalculus.EndTestCase;
import static Calculus.UsageCalculus.EqnActualCalcuDB;
import static Calculus.UsageCalculus.EqnActualMap1DB;
import static Calculus.UsageCalculus.EqnActualMap2DB;
import static Calculus.UsageCalculus.EqnDB;
import static Calculus.UsageCalculus.EqnDBDupCount;
import static Calculus.UsageCalculus.EqnDBIndex;
import static Calculus.UsageCalculus.EqnExpectedCalcuDB;
import static Calculus.UsageCalculus.EqnExpectedMap1DB;
import static Calculus.UsageCalculus.EqnExpectedMap2DB;
import static Calculus.UsageCalculus.EqnExprnDB;
import static Calculus.UsageCalculus.EqnRegressionDiffStatus;
import static Calculus.UsageCalculus.EqnRegressionIntegreStatus;
import static Calculus.UsageCalculus.EqnSolArrayDiffAlone;
import static Calculus.UsageCalculus.EqnSolArrayIntegrAlone;
import static Calculus.UsageCalculus.EqnSolArrayMap1;
import static Calculus.UsageCalculus.EqnSolArrayMap2;
import static Calculus.UsageCalculus.EqnSolArrayMap3;
import static Calculus.UsageCalculus.EqnSolArrayMap4;
import static Calculus.UsageCalculus.EqnUnderTest;
import static Calculus.UsageCalculus.EqnUnderTestDB;
import static Calculus.UsageCalculus.ExceptionStringDB;
import static Calculus.UsageCalculus.ExceptionTestCases;
import static Calculus.UsageCalculus.FailedCurrRun;
import static Calculus.UsageCalculus.FailedTestCases;
import static Calculus.UsageCalculus.FailedTestCount;
import static Calculus.UsageCalculus.GapProcess;
import static Calculus.UsageCalculus.InvertAnsBothFlippedCount;
import static Calculus.UsageCalculus.InvertAnsFlippedCount;
import static Calculus.UsageCalculus.KnownIssueTestCasesFlag;
import static Calculus.UsageCalculus.KnownIssues;
import static Calculus.UsageCalculus.KnownIssuesTestCases;
import static Calculus.UsageCalculus.LastTestCaseHarness;
import static Calculus.UsageCalculus.MaxDiffOrder;
import static Calculus.UsageCalculus.MaxIndexByPassedTest;
import static Calculus.UsageCalculus.MaxIndexExcept;
import static Calculus.UsageCalculus.MaxIndexFail;
import static Calculus.UsageCalculus.MaxIndexMissedNumberTest;
import static Calculus.UsageCalculus.MaxIndexWrongAnsCalculus1;
import static Calculus.UsageCalculus.MaxIndexWrongAnsMap1;
import static Calculus.UsageCalculus.MaxIndexWrongAnsMap2;
import static Calculus.UsageCalculus.MaxIntegreOrder;
import static Calculus.UsageCalculus.MissedNumber;
import static Calculus.UsageCalculus.MissedNumberTestCases;
import static Calculus.UsageCalculus.MissedTestCasesException;
import static Calculus.UsageCalculus.MissedTestCasesInfinity;
import static Calculus.UsageCalculus.NULLStrTestCases;
import static Calculus.UsageCalculus.NullTestCases;
import static Calculus.UsageCalculus.NullTestCasesFlag;
import static Calculus.UsageCalculus.Order;
import static Calculus.UsageCalculus.OrderTestDB;
import static Calculus.UsageCalculus.PassedTestCount;
import static Calculus.UsageCalculus.Pragma;
import static Calculus.UsageCalculus.RegressionControl;
import static Calculus.UsageCalculus.Section;
import static Calculus.UsageCalculus.SectionIndexFail;
import static Calculus.UsageCalculus.SectionStart;
import static Calculus.UsageCalculus.SectionTestCaseEnd;
import static Calculus.UsageCalculus.SectionTestCaseStart;
import static Calculus.UsageCalculus.StageMapping;
import static Calculus.UsageCalculus.TestCase;
import static Calculus.UsageCalculus.TestCaseConformalValDB;
import static Calculus.UsageCalculus.TestCaseFailCalcuStrCount;
import static Calculus.UsageCalculus.TestCaseFailMap1StrCount;
import static Calculus.UsageCalculus.TestCaseFailMap2StrCount;
import static Calculus.UsageCalculus.TestCaseFile;
import static Calculus.UsageCalculus.TestCaseMatrixID;
import static Calculus.UsageCalculus.TestCaseName;
import static Calculus.UsageCalculus.TestCasePassCalcuStrCount;
import static Calculus.UsageCalculus.TestCasePassConformalValFlag;
import static Calculus.UsageCalculus.TestCasePassHighLevelFlag;
import static Calculus.UsageCalculus.TestCasePassMap1StrCount;
import static Calculus.UsageCalculus.TestCasePassMap2StrCount;
import static Calculus.UsageCalculus.TestCasePassStrFlag;
import static Calculus.UsageCalculus.TestCasePassValFlag;
import static Calculus.UsageCalculus.TestCaseStrDB;
import static Calculus.UsageCalculus.TestCaseValDB;
import static Calculus.UsageCalculus.TestCasesHighLevelDB;
import static Calculus.UsageCalculus.TestHarnessDiff;
import static Calculus.UsageCalculus.TotalTestCases;
import static Calculus.UsageCalculus.WrongAnsTestCasesCalculus1;
import static Calculus.UsageCalculus.WrongAnsTestCasesMap1;
import static Calculus.UsageCalculus.WrongAnsTestCasesMap2;
import static Calculus.UsageCalculus.WrongAnswerCalculus1;
import static Calculus.UsageCalculus.WrongAnswerCountCalculus1;
import static Calculus.UsageCalculus.WrongAnswerCountMap1;
import static Calculus.UsageCalculus.WrongAnswerCountMap2;
import static Calculus.UsageCalculus.WrongAnswerFlagCalculus1;
import static Calculus.UsageCalculus.WrongAnswerFlagMap1;
import static Calculus.UsageCalculus.WrongAnswerFlagMap2;
import static Calculus.UsageCalculus.WrongAnswerMap1;
import static Calculus.UsageCalculus.WrongAnswerMap2;
import static Calculus.UsageCalculus.cause;
import static Calculus.UsageCalculus.ruleAnalytics;
import org.apache.log4j.Logger;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author pai_c
 */
public class JavaAiGen {
    public static Logger log = Logger.getLogger(JavaAiGen.class.getName());
        public interface ConstEvaluator {
        String eval();
    }

    public static ConstEvaluator parseConst(String expr, String diffVar) {
        return new Object() {
            int pos = 0;
            char ch;

            void nextChar() {
                ch = (++pos < expr.length()) ? expr.charAt(pos) : '\0';
            }

            boolean eat(char expected) {
                while (ch == ' ') nextChar();
                if (ch == expected) {
                    nextChar();
                    return true;
                }
                return false;
            }

            ConstEvaluator parse() {
                nextChar();
                ConstEvaluator x = parseTerm();
                return x;
            }

            ConstEvaluator parseTerm() {
                ConstEvaluator x = parseFactor();
                while (true) {
                    if (eat('*')) {
                        ConstEvaluator b = parseFactor();
                        final String xFinal=x.eval();
                        x = () -> xFinal + "*" + b.eval();
                    } else if (eat('/')) {
                        ConstEvaluator b = parseFactor();
                        final String xFinal=x.eval();
                        x = () -> xFinal + "/" + b.eval();
                    } else {
                        return x;
                    }
                }
            }

            ConstEvaluator parseFactor() {
                ConstEvaluator x = parseBase();
                while (eat('^')) {
                    ConstEvaluator exponent = parseBase();
                    final String xFinal=x.eval();
                    x = () -> xFinal + "^" + exponent.eval();
                }
                return x;
            }

            ConstEvaluator parseBase() {
                if (eat('-')) {
                    ConstEvaluator base = parseBase();
                    return () -> "-" + base.eval();
                }
                if (Character.isDigit(ch)) {
                    int start = pos;
                    while (Character.isDigit(ch) || ch == '.') nextChar();
                    String number = expr.substring(start, pos);
                    return () -> number;
                }
                if (Character.isLetter(ch)) {
                    int start = pos;
                    while (Character.isLetterOrDigit(ch)) nextChar();
                    String var = expr.substring(start, pos);
                    return () -> var.equals(diffVar) ? "1.0" : var;
                }
                return () -> "";
            }

        }.parse();
    }
    public interface IndConstEvaluator {
        String eval();
    }

    public static IndConstEvaluator parseIndConst(String expr, String diffVar) {
        return new Object() {
            int pos = -1;
            char ch;

            void nextChar() {
                ch = (++pos < expr.length()) ? expr.charAt(pos) : '\0';
            }

            boolean eat(char expected) {
                while (ch == ' ') nextChar();
                if (ch == expected) {
                    nextChar();
                    return true;
                }
                return false;
            }

            IndConstEvaluator parse() {
                nextChar();
                return parseTerm();
            }

            IndConstEvaluator parseTerm() {
                Map<String, Double> exponentMap = new LinkedHashMap<>();

                while (true) {
                    IndConstEvaluator factor = parseFactor();
                    String val = factor.eval();

                    if (val.startsWith("1/")) {
                        String base = val.substring(2);
                        if (!base.equals(diffVar)) {
                            exponentMap.put(base, exponentMap.getOrDefault(base, 0.0) - 1.0);
                        }
                    } else if (val.contains("^")) {
                        String[] parts = val.split("\\^");
                        String base = parts[0];
                        double exp = Double.parseDouble(parts[1]);
                        if (!base.equals(diffVar)) {
                            exponentMap.put(base, exponentMap.getOrDefault(base, 0.0) + exp);
                        }
                    } else {
                        if (!val.equals(diffVar)) {
                            exponentMap.put(val, exponentMap.getOrDefault(val, 0.0) + 1.0);
                        }
                    }

                    if (eat('*')) continue;
                    else if (eat('/')) {
                        IndConstEvaluator divisor = parseFactor();
                        String divVal = divisor.eval();
                        if (divVal.contains("^")) {
                            String[] parts = divVal.split("\\^");
                            String base = parts[0];
                            double exp = Double.parseDouble(parts[1]);
                            if (!base.equals(diffVar)) {
                                exponentMap.put(base, exponentMap.getOrDefault(base, 0.0) - exp);
                            }
                        } else {
                            if (!divVal.equals(diffVar)) {
                                exponentMap.put(divVal, exponentMap.getOrDefault(divVal, 0.0) - 1.0);
                            }
                        }
                    } else break;
                }

                return () -> {
                    if (exponentMap.isEmpty()) return "1.0";
                    return exponentMap.entrySet().stream()
                        .map(e -> e.getValue() == 1.0 ? e.getKey() : e.getKey() + "^" + e.getValue())
                        .collect(Collectors.joining("*"));
                };
            }

            IndConstEvaluator parseFactor() {
                IndConstEvaluator x = parseBase();
                while (eat('^')) {
                    IndConstEvaluator exponent = parseBase();
                    return () -> x.eval() + "^" + exponent.eval();
                }
                return x;
            }

            IndConstEvaluator parseBase() {
                if (eat('-')) {
                    IndConstEvaluator base = parseBase();
                    return () -> "-" + base.eval();
                }
                if (eat('+')) {
                    return parseBase(); // unary plus
                }
                if (Character.isLetter(ch)) {
                    int start = pos;
                    while (Character.isLetterOrDigit(ch)) nextChar();
                    return () -> expr.substring(start, pos);
                }
                if (Character.isDigit(ch)) {
                    int start = pos;
                    while (Character.isDigit(ch) || ch == '.') nextChar();
                    return () -> expr.substring(start, pos);
                }
                return () -> "";
            }

        }.parse();
    }
     public interface VarEvaluator {
        String eval();
    }

    public static VarEvaluator parseVar(String expr, String diffVar) {
        return new Object() {
            int pos = -1;
            char ch;

            void nextChar() {
                ch = (++pos < expr.length()) ? expr.charAt(pos) : '\0';
            }

            boolean eat(char expected) {
                while (ch == ' ') nextChar();
                if (ch == expected) {
                    nextChar();
                    return true;
                }
                return false;
            }

            VarEvaluator parse() {
                nextChar();
                return parseTerm();
            }

            VarEvaluator parseTerm() {
                double exponent = 0.0;

                while (true) {
                    VarEvaluator factor = parseFactor();
                    String val = factor.eval();

                    if (val.equals(diffVar)) {
                        exponent += 1.0;
                    } else if (val.equals("1/" + diffVar)) {
                        exponent -= 1.0;
                    } else if (val.startsWith(diffVar + "^")) {
                        double exp = Double.parseDouble(val.substring(diffVar.length() + 1));
                        exponent += exp;
                    } else if (val.startsWith("1/" + diffVar + "^")) {
                        double exp = Double.parseDouble(val.substring(("1/" + diffVar + "^").length()));
                        exponent -= exp;
                    }

                    if (eat('*')) continue;
                    else if (eat('/')) {
                        VarEvaluator divisor = parseFactor();
                        String divVal = divisor.eval();
                        if (divVal.equals(diffVar)) {
                            exponent -= 1.0;
                        } else if (divVal.startsWith(diffVar + "^")) {
                            double exp = Double.parseDouble(divVal.substring(diffVar.length() + 1));
                            exponent -= exp;
                        }
                    } else break;
                }

                final double finalExponent = exponent;
                return () -> {
                    if (finalExponent == 0.0) return "1.0";
                    if (finalExponent == 1.0) return diffVar;
                    return diffVar + "^" + finalExponent;
                };
            }

            VarEvaluator parseFactor() {
                VarEvaluator x = parseBase();
                while (eat('^')) {
                    VarEvaluator exponent = parseBase();
                    return () -> x.eval() + "^" + exponent.eval();
                }
                return x;
            }

            VarEvaluator parseBase() {
                if (eat('-')) {
                    VarEvaluator base = parseBase();
                    return () -> "-" + base.eval();
                }
                if (eat('+')) {
                    return parseBase(); // unary plus
                }
                if (Character.isLetter(ch)) {
                    int start = pos;
                    while (Character.isLetterOrDigit(ch)) nextChar();
                    String var = expr.substring(start, pos);
                    return () -> var;
                }
                if (Character.isDigit(ch)) {
                    int start = pos;
                    while (Character.isDigit(ch) || ch == '.') nextChar();
                    return () -> expr.substring(start, pos);
                }
                return () -> "";
            }

        }.parse();
    }
    public interface SymbolicTerm {
        String eval();
    }

    public static SymbolicTerm parseBaseSimple(String expr, String diffVar, String mapType) {
        return switch (mapType) {
            case "Map1" -> parseMap1(expr, diffVar);
            case "Map2" -> parseMap2(expr, diffVar);
            default -> () -> expr; // fallback
        };
    }

    private static SymbolicTerm parseMap1(String expr, String diffVar) {
        return () -> {
            String constPart = JavaAiGen.parseConst(expr, diffVar).eval();
            String varPart = JavaAiGen.parseVar(expr, diffVar).eval();
            String indPart = JavaAiGen.parseIndConst(expr, diffVar).eval();

            List<String> terms = new ArrayList<>();
            if (!constPart.equals("1.0")) terms.add(constPart);
            if (!varPart.equals("1.0")) terms.add(varPart);
            if (!indPart.equals("1.0")) terms.add(indPart);

            return String.join("*", terms);
        };
    }

    private static SymbolicTerm parseMap2(String expr, String diffVar) {
        return () -> {
            String cleaned = expr.replaceAll("[^a-zA-Z0-9^*/.]", "");
            String constPart = JavaAiGen.parseConst(cleaned, diffVar).eval();
            String varPart = JavaAiGen.parseVar(cleaned, diffVar).eval();
            String indPart = JavaAiGen.parseIndConst(cleaned, diffVar).eval();

            List<String> terms = new ArrayList<>();
            if (!constPart.equals("1.0")) terms.add(constPart);
            if (!varPart.equals("1.0")) terms.add(varPart);
            if (!indPart.equals("1.0")) terms.add(indPart);

            return String.join("*", terms);
        };
    }
    public static void mainRegresssionTest(int MaxOrder, TestHarnessClass TestData, String IntegrORDiffr, String xExprnOptionSelected) {
        String AlgoDispStr = "";
        String AlgoDispIntegrORDiffr = "";
        ruleAnalytics = new RuleAnalytics();
        ruleAnalytics.Init();
        //ruleAnalyticsPassed = new RuleAnalytics();
        //testResultsPassed = new HashMap<>();
        //testResultsFailed = new HashMap<>();
        if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
            AlgoDispStr = "mainIntegrTest";
        } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
            AlgoDispStr = "mainDiffTest";
        }
        if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
            AlgoDispIntegrORDiffr = "Integral";
        } else if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
            AlgoDispIntegrORDiffr = "Diffrentiation";
        }
        String MapType = "Map1";
        int AllTestCaseOrderPassed = 0;

        WrongAnswerFlagMap1 = false;
        WrongAnswerCountMap1 = 0;
        WrongAnswerFlagMap2 = false;
        WrongAnswerCountMap2 = 0;
        WrongAnswerFlagCalculus1 = false;
        WrongAnswerCountCalculus1 = 0;
        TestCasePassMap1StrCount = 0;
        TestCaseFailMap1StrCount = 0;
        TestCasePassCalcuStrCount = 0;
        TestCaseFailCalcuStrCount = 0;
        TestCasePassMap2StrCount = 0;
        TestCaseFailMap2StrCount = 0;

        int MaxOrder1 = MaxOrder;
        int OldKnwnI = 0;
        int OldKnwnIStartSection = 0;
        String Exprn = "";
        String OverallRegressionStatus = AlgoDispIntegrORDiffr + " : Pass All (4000 to 110023) Except Test Cases: "
                + "\n" + "TestCases:Unit Test Cases" + " All Passing"
                + "\n" + "TestCases:Names " + " All Passing"
                + "\n" + "TestCases:Coefficients " + " 20016 , 20017"
                + "\n" + "TestCases:Exponent " + " 30006 to 30008"
                + "\n" + "TestCases:Parentheses " + " 80001 to 80024";
        System.out.print(ConsoleColors.BLUE + AlgoDispIntegrORDiffr + " : Overall Regression Status" + OverallRegressionStatus + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if (EndTestCase > LastTestCaseHarness) {
            EndTestCase = LastTestCaseHarness;
        }
        System.out.print(ConsoleColors.BLUE + AlgoDispIntegrORDiffr + " EndTestCase=" + EndTestCase + " LastTestCaseHarness=" + LastTestCaseHarness + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        if (EndTestCase < TestCase) {
            EndTestCase = TestCase;
        }
        long j = TestCase;
        EqnDB = new HashMap<>();
        EqnUnderTestDB = new HashMap<>();
        OrderTestDB = new HashMap<>();
        EqnExprnDB = new HashMap<>();
        EqnActualMap1DB = new HashMap<>();
        EqnExpectedMap1DB = new HashMap<>();
        EqnActualCalcuDB = new HashMap<>();
        EqnExpectedCalcuDB = new HashMap<>();
        EqnActualMap2DB = new HashMap<>();
        EqnExpectedMap2DB = new HashMap<>();
        FailedTestCases = new HashMap<Integer, String>();
        ExceptionTestCases = new HashMap<Integer, String>();
        ExceptionStringDB = new HashMap<Integer, String>();
        cause = new Throwable();
        TotalTestCases = 0;
        NullTestCases = 0;
        KnownIssues = 0;
        CoreKnownIssues = 0;

        EqnDB.clear();
        EqnUnderTestDB.clear();
        OrderTestDB.clear();
        EqnExprnDB.clear();
        EqnActualMap1DB.clear();
        EqnExpectedMap1DB.clear();
        EqnActualCalcuDB.clear();
        EqnExpectedCalcuDB.clear();
        EqnActualMap2DB.clear();
        EqnExpectedMap2DB.clear();

        TestCasesHighLevelDB.clear();
        TestCaseStrDB.clear();
        TestCaseValDB.clear();
        TestCaseConformalValDB.clear();

        FailedTestCases.clear();
        ExceptionTestCases.clear();
        WrongAnsTestCasesMap1.clear();
        WrongAnsTestCasesMap2.clear();
        WrongAnsTestCasesCalculus1.clear();
        ByPassed.clear();
        MissedNumber.clear();
        NULLStrTestCases.clear();
        KnownIssuesTestCases.clear();
        FailedCurrRun.clear();

        ByPassedTestCases = 0;
        MissedNumberTestCases = 0;
        MaxIndexByPassedTest = 0;
        MaxIndexMissedNumberTest = 0;

        MissedTestCasesInfinity = 0;
        MissedTestCasesException = 0;

        MaxIndexExcept = 0;
        MaxIndexWrongAnsMap1 = 0;
        MaxIndexWrongAnsCalculus1 = 0;
        MaxIndexWrongAnsMap2 = 0;

        MaxIndexFail = 0;
        SectionIndexFail = 1;
        FailedTestCount = 0;
        PassedTestCount = 0;
        int OldFailedTestCount = FailedTestCount;
        SectionStart = TestCase;

        EqnDBIndex = 0;
        EqnDBDupCount = 0;
        int OldDups = EqnDBDupCount;
        long OldTestCase = j;
        int OldMaxIndexFail = 0;
        int OldTotalTestCases = 0;
        int OldInvertAnsBothFlippedCount=0;
        int OldInvertAnsFlippedCount=0;
        boolean DupFlag = false;
        while (j <= EndTestCase) {
            EqnUnderTest = "";
            KnownIssueTestCasesFlag = false;
            CoreKnownIssuesTestCasesFlag = false;
            DupFlag = false;
            String TempExprn = "";
            TempExprn = TestHarnessDiff(AlgoDispStr, j,xExprnOptionSelected);
            if ((j == SectionTestCaseStart)) {
                OldKnwnIStartSection = KnownIssues;
                if (KnownIssueTestCasesFlag == true) {
                    OldKnwnIStartSection--;
                }
                //System.out.println("UsageCalculus:mainRegresssionTest:Start:" + AlgoDispStr + ":OldKnwnI=" + OldKnwnI + " KnownIssues=" + KnownIssues + " OldKnwnIStartSection=" + OldKnwnIStartSection);
            }
            Exprn = eatAll(TempExprn, ' ');
            DupFlag = DupChecknInsert(j);
            TestCasePassHighLevelFlag = false;
            if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
                if (MaxOrder == -1) {
                    MaxOrder1 = MaxDiffOrder; //From Test Case
                } else if (MaxOrder >= MaxDiffOrder) {
                    MaxOrder1 = MaxDiffOrder;
                } else {
                    MaxOrder1 = MaxOrder;
                }
            } else if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
                if (MaxOrder == -1) {
                    MaxOrder1 = MaxIntegreOrder; //From Test Case
                } else if (MaxOrder >= MaxIntegreOrder) {
                    MaxOrder1 = MaxIntegreOrder;
                } else {
                    MaxOrder1 = MaxOrder;
                }
            }
            Order = 1;
            OldMaxIndexFail = MaxIndexFail;
            if (/*(!Exprn.equalsIgnoreCase("")) && */((DupFlag == false))) {
                if (IntegrORDiffr.equalsIgnoreCase("Diffr")) {
                    if (!Exprn.equalsIgnoreCase("")) {
                        ChaosPrevention();
                        if (AITestResultsGenFlag) {
                            AIDiffSingleHighTestCase(MaxOrder1, Exprn, MapType, IntegrORDiffr,"");
                        } else {
                            DiffSingleHighTestCase(MaxOrder1, Exprn, MapType, IntegrORDiffr);
                        }
                    } else {
                        ;
                    }
                    if (TestCasePassHighLevelFlag) {
                        TotalTestCases++;
                        PassedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, true);
                    } else if ((TestCasePassHighLevelFlag == false) && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                        FailedTestCases.put(MaxIndexFail, "" + TestCase + " Order=" + Order + ",");
                        FailedCurrRun.put(FailedTestCount, "" + TestCase);
                        MaxIndexFail++;
                        FailedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, false);
                        TotalTestCases++;
                    } else {
                        TotalTestCases++;
                    }
                    if ( /*&&(!Exprn.equalsIgnoreCase(""))*/(!EqnSolArrayMap2[Order - 1].equalsIgnoreCase("")) && (!EqnSolArrayMap1[Order - 1].equalsIgnoreCase(""))) {

                    } else if ((TestCasePassHighLevelFlag == false) && (Order == MaxOrder1)
                            && (EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))
                            && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                        NullTestCasesFlag = true;
                        if (!NullTestCasesFlag) {
                            FailedTestCount++;
                        }
                        TestCasePassHighLevelFlag = false;
                        NullTestCases++;
                        NULLStrTestCases.put(NullTestCases, "" + TestCase);
                        NullTestCasesFlag = false;
                    }
                } else if (IntegrORDiffr.equalsIgnoreCase("Integr")) {
                    if (!Exprn.equalsIgnoreCase("")) {
                        ChaosPrevention();
                        if (AITestResultsGenFlag) {
                            AIIntegralHighSingleTest(MaxOrder1, Exprn, MapType, IntegrORDiffr,"");
                        } else {
                            IntegralHighSingleTest(MaxOrder1, Exprn, MapType, IntegrORDiffr);
                        }
                    } else {
                        ;
                    }
                    if (TestCasePassHighLevelFlag) {
                        TotalTestCases++;
                        PassedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, TestCasePassHighLevelFlag);

                    } else if ((TestCasePassHighLevelFlag == false) && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                        FailedTestCases.put(MaxIndexFail, "" + TestCase + " Order=" + Order + ",");
                        FailedCurrRun.put(FailedTestCount, "" + TestCase);
                        MaxIndexFail++;
                        FailedTestCount++;
                        ruleAnalytics.setTestCaseStatus("" + TestCase, TestCasePassHighLevelFlag);
                        TotalTestCases++;
                    } else {
                        TotalTestCases++;
                    }
                    if (/*(!Exprn.equalsIgnoreCase(""))*/(!EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (!EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))) {

                    } else if ((TestCasePassHighLevelFlag == false) && (Order == MaxOrder1)
                            && (EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))
                            && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                        NullTestCasesFlag = true;
                        if (!NullTestCasesFlag) {
                            FailedTestCount++;
                        }
                        TestCasePassHighLevelFlag = false;
                        NullTestCases++;
                        NULLStrTestCases.put(NullTestCases, "" + TestCase);
                        NullTestCasesFlag = false;
                    }
                }
                System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase);
            } else if (DupFlag == true) {
                System.out.println(ConsoleColors.RED + AlgoDispStr + ": j=" + j + " TestCase=" + TestCase + " Dup. Hence NOT Executing.");

            }
            OldTestCase = j;
            if (j == SectionTestCaseEnd) {
                OldKnwnI = KnownIssues - OldKnwnIStartSection;
                //System.out.println("UsageCalculus:mainRegresssionTest:End:" + AlgoDispStr + ":OldKnwnI=" + OldKnwnI + " KnownIssues=" + KnownIssues + " OldKnwnIStartSection=" + OldKnwnIStartSection);
            }
            j = RegressionControl(j);
            if (((j - OldTestCase) > 1)) {
                GapProcess(AlgoDispStr, j, OldTotalTestCases, OldTestCase, OldMaxIndexFail, OldFailedTestCount, OldDups, OldKnwnI, EqnDBDupCount,OldInvertAnsBothFlippedCount,OldInvertAnsFlippedCount);
                OldFailedTestCount = FailedTestCount;
                OldDups = EqnDBDupCount;
                SectionStart = j;
                OldTotalTestCases = TotalTestCases;
                if (j == SectionTestCaseEnd) {
                    OldInvertAnsBothFlippedCount=InvertAnsBothFlippedCount;
                    OldInvertAnsFlippedCount=InvertAnsFlippedCount;
                    }
            }
            TestCase = j;
        }
        GapProcess(AlgoDispStr, j, OldTotalTestCases, OldTestCase, OldMaxIndexFail, OldFailedTestCount, OldDups, OldKnwnI, EqnDBDupCount,0,0);

        int k = 0;
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                k++;
            }
        }
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase  Final Summary : Total Failed=" + FailedTestCount + " Out of Run TestCases-Dups=" + (TotalTestCases) + " Passed Count=" + PassedTestCount/*(TotalTestCases - FailedTestCount)*/ + " NullTestCases=" + NullTestCases + " KnownIssues=" + KnownIssues + " CoreKnownIssues=" + CoreKnownIssues + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : DupCount=" + k + " Total Exceptions=" + MaxIndexExcept + " WrongAnswerCountMap1=" + WrongAnswerCountMap1 + " WrongAnswerCountCalculus1=" + WrongAnswerCountCalculus1 + " WrongAnswerCountMap2=" + WrongAnswerCountMap2 + ConsoleColors.RESET);
        //System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : ByPassedTestCases=" + ByPassedTestCases + " MissedNumberTestCases=" + MissedNumberTestCases + " MissedTestCasesInfinity=" + MissedTestCasesInfinity + " MissedTestCasesException=" + MissedTestCasesException + ConsoleColors.RESET);
        //System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : Map1:PassMap1Count=" + TestCasePassMap1StrCount + " Fail=" + TestCaseFailMap1StrCount + ConsoleColors.RESET);
        //System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : Calcu:PassCalcuCount=" + TestCasePassCalcuStrCount + " Fail=" + TestCaseFailCalcuStrCount + ConsoleColors.RESET);
        //System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : Map2:PassMap2Count=" + TestCasePassMap2StrCount + " Fail=" + TestCaseFailMap2StrCount + ConsoleColors.RESET);
        for (int y = 0; (FailedTestCases != null) && (y <= FailedTestCases.size()); y++) {
            if ((y < FailedTestCases.size()) && (FailedTestCases.get(y) != null)) {
                if ((FailedTestCases.get(y).contains("Section")) && (FailedTestCases.get(y).contains("Complete # of Failures="))) {
                    System.out.print(ConsoleColors.GREEN + FailedTestCases.get(y) + ConsoleColors.RESET);
                }
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Summary : " + " Failed Test Cases are:" + ConsoleColors.RESET);

        for (int y = 0; (y <= FailedTestCases.size()); y++) {
            if (FailedTestCases.get(y) != null) {
                System.out.print(ConsoleColors.RED + " " + FailedTestCases.get(y) + ", " + ConsoleColors.RESET);
                if ((y != 0) && (y % 5 == 0)) {
                    System.out.print(System.lineSeparator());
                }
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": Exception TestCase Summary : Total Exceptions=" + MaxIndexExcept + " Exception Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.print(ConsoleColors.RED + " " + ExceptionTestCases.get(y) + ", " + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }

        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Duplicate Summary : " + " EqnDBIndex=" + EqnDBIndex + ConsoleColors.RESET);
        for (int y = 0; (y <= EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                System.out.print(ConsoleColors.GREEN + EqnDB.get(y) + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
            }
        }
        System.out.println(ConsoleColors.RED + AlgoDispStr + ": TestCase Duplicate Summary : Total Dups=" + k + ConsoleColors.RESET);
        System.out.print(System.lineSeparator());
        for (int y = 0; y < MaxIndexExcept; y++) {
            System.out.println(ConsoleColors.RED + " " + ExceptionStringDB.get(y) + ConsoleColors.RESET);
        }
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Map1: Total Wrong=" + MaxIndexWrongAnsMap1 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexWrongAnsMap1; y++) {
            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesMap1.get(y) + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Calculus1: Total Wrong=" + MaxIndexWrongAnsCalculus1 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexWrongAnsCalculus1; y++) {
            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesCalculus1.get(y) + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Map2: Total Wrong=" + MaxIndexWrongAnsMap2 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexWrongAnsMap2; y++) {
            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesMap2.get(y) + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": ByPassedTestCases TestCase Summary : Total ByPassed=" + MaxIndexByPassedTest + " ByPassed Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; y < MaxIndexByPassedTest; y++) {
            System.out.print(ConsoleColors.RED + " " + ByPassed.get(y) + ConsoleColors.RESET);
            if ((y != 0) && (y % 5 == 0)) {
                System.out.print(System.lineSeparator());
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": MissedNumberTestCases TestCase Summary : Total MissedNumber=" + MaxIndexMissedNumberTest + " MissedNumber Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; (y < MaxIndexMissedNumberTest); y++) {
            if (MissedNumber.get(y) != null) {
                System.out.print(ConsoleColors.RED + " " + MissedNumber.get(y) + ", " + ConsoleColors.RESET);
                if ((y != 0) && (y % 5 == 0)) {
                    System.out.print(System.lineSeparator());
                }
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": NULL STRING TestCase Summary : Total NULL STRING=" + NullTestCases + " Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; (y <= NullTestCases); y++) {
            if ((NULLStrTestCases.get(y) != null)) {
                System.out.print(ConsoleColors.RED + " " + NULLStrTestCases.get(y) + "," + ConsoleColors.RESET);
                if ((y != 0) && (y % 10 == 0)) {
                    System.out.print(System.lineSeparator());
                }
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": KnownIssues TestCase Summary : Total KnownIssues=" + KnownIssues + " Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; (y <= KnownIssuesTestCases.size()); y++) {
            if ((KnownIssuesTestCases.get(y) != null)) {
                System.out.print(ConsoleColors.RED + " " + KnownIssuesTestCases.get(y) + "," + ConsoleColors.RESET);
                if ((y != 0) && (y % 10 == 0)) {
                    System.out.print(System.lineSeparator());
                }
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Failures in Current Run TestCase Summary : Total Failures=" + FailedTestCount + " Test Cases are:" + ConsoleColors.RESET);
        for (int y = 0; (y <= FailedCurrRun.size()); y++) {
            if ((FailedCurrRun.get(y) != null)) {
                System.out.print(ConsoleColors.RED + " " + FailedCurrRun.get(y) + "," + ConsoleColors.RESET);
                if ((y != 0) && (y % 10 == 0)) {
                    System.out.print(System.lineSeparator());
                }
            }
        }
        System.out.print(System.lineSeparator());
        System.out.println("===== Rule Summary =====");
        // 3️⃣ Generate analytics summary after all test cases are processed
        ruleAnalytics.printSummaries();

        System.out.print(System.lineSeparator());

//        System.out.println("Detailed Passed Summary");
//        
//        for (String str : testCaseStatus.keySet()) {
//            if (testCaseStatus.get(str)){
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " EqnUnderTest    =" + EqnUnderTestDB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " Order  =" + OrderTestDB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " Exprn           =" + EqnExprnDB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " ActualMap1      =" + EqnActualMap1DB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " ExpectedMap1    =" + EqnExpectedMap1DB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " ActualCalcu     =" + EqnActualCalcuDB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " ExpectedCalcu   =" + EqnExpectedCalcuDB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " ActualMap2      =" + EqnActualMap2DB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " ExpectedMap2    =" + EqnExpectedMap2DB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " HighLevel Test Status  =" + TestCasesHighLevelDB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " LowLevel String Test  =" + TestCaseStrDB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " LowLevel Value Test  =" + TestCaseValDB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " LowLevel Conformal Mapping Test  =" + TestCaseConformalValDB.get(str) + ConsoleColors.RESET);
//            System.out.println(ConsoleColors.GREEN + " TestCase=" + str + " Passed" + ConsoleColors.RESET);
//            System.out.print(System.lineSeparator());
//            }
//        }
//        System.out.print(System.lineSeparator());
        int i = 0;
        int y = 0;
        int blockNum=1;
        System.out.println("Detailed Failed Summary:Block:blockNum=" + blockNum + " i=" + i);
        for (/*String str : sortedTestCases.keySet()*/Map.Entry<Integer, Boolean> entry : sortedTestCases.entrySet()) {
            String str = "" + entry.getKey();
            if ((!entry.getValue()) && (i >= 0) && (i < 100)) {
                if ((str != null) && (!str.equalsIgnoreCase("")) && ((EqnExpectedMap1DB.get(str) != null) && (!EqnExpectedMap1DB.get(str).equalsIgnoreCase("")) && (EqnExpectedCalcuDB.get(str) != null) && (!EqnExpectedCalcuDB.get(str).equalsIgnoreCase("")) && (EqnExpectedMap2DB.get(str) != null) && (!EqnExpectedMap2DB.get(str).equalsIgnoreCase("")))) {
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " EqnUnderTest  =" + EqnUnderTestDB.get(str) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " Order  =" + OrderTestDB.get(str) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " Exprn         =" + EqnExprnDB.get(str) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ActualMap1    =" + EqnActualMap1DB.get(str) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ExpectedMap1  =" + EqnExpectedMap1DB.get(str) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ActualCalcu   =" + EqnActualCalcuDB.get(str) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ExpectedCalcu =" + EqnExpectedCalcuDB.get(str) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ActualMap2    =" + EqnActualMap2DB.get(str) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ExpectedMap2  =" + EqnExpectedMap2DB.get(str) + ConsoleColors.RESET);

                System.out.println(ConsoleColors.RED + " TestCase=" + str + " HighLevel Test Status  =" + TestCasesHighLevelDB.get(str) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " LowLevel String Test  =" + TestCaseStrDB.get(str) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " LowLevel Value Test  =" + TestCaseValDB.get(str) + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + " TestCase=" + str + " LowLevel Conformal Mapping Test  =" + TestCaseConformalValDB.get(str) + ConsoleColors.RESET);

                System.out.println(ConsoleColors.RED + " TestCase=" + str + " Failed" + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
                i++;
                y++;
                }
            } else if (i >= 100) {
                int z = i;
                i = 0;
                blockNum++;
                System.out.println("Detailed Failed Summary:Block:blockNum=" + blockNum + " i=" + z);
            }
        }
        System.out.println("Failure Data Summary: Number of Test Cases=" + y);
//        System.out.println("Incomplete Test Cases Summary");
//        i = 0;
//        for (/*String str : sortedTestCases.keySet()*/Map.Entry<Integer, Boolean> entry : sortedTestCases.entrySet()) {
//            String str = "" + entry.getKey();
//            if ((str != null) && (!str.equalsIgnoreCase("")) && ((EqnExpectedMap1DB.get(str) == null) || (EqnExpectedMap1DB.get(str).equalsIgnoreCase("")) || (EqnExpectedCalcuDB.get(str) == null) || (EqnExpectedCalcuDB.get(str).equalsIgnoreCase("")) || (EqnExpectedMap2DB.get(str) == null) || (EqnExpectedMap2DB.get(str).equalsIgnoreCase("")))) {
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " EqnUnderTest  =" + EqnUnderTestDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " Order  =" + OrderTestDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " Exprn         =" + EqnExprnDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ActualMap1    =" + EqnActualMap1DB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ExpectedMap1  =" + EqnExpectedMap1DB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ActualCalcu   =" + EqnActualCalcuDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ExpectedCalcu =" + EqnExpectedCalcuDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ActualMap2    =" + EqnActualMap2DB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ExpectedMap2  =" + EqnExpectedMap2DB.get(str) + ConsoleColors.RESET);
//
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " HighLevel Test Status  =" + TestCasesHighLevelDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " LowLevel String Test  =" + TestCaseStrDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " LowLevel Value Test  =" + TestCaseValDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " LowLevel Conformal Mapping Test  =" + TestCaseConformalValDB.get(str) + ConsoleColors.RESET);
//
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " Incomplete Test Data" + ConsoleColors.RESET);
//                System.out.print(System.lineSeparator());
//                i++;
//            }
//        }
//        System.out.println("Incomplete Test Data Summary: Number of Test Cases=" + i);
//        System.out.println("Incomplete NULL Testing Summary");
//        i = 0;
//        for (/*String str : sortedTestCases.keySet()*/Map.Entry<Integer, Boolean> entry : sortedTestCases.entrySet()) {
//            String str = "" + entry.getKey();
//            if ((str != null) && (!str.equalsIgnoreCase("")) && ((EqnActualMap1DB.get(str) == null) || (EqnActualMap1DB.get(str).equalsIgnoreCase("")) || (EqnActualCalcuDB.get(str) == null) || (EqnActualCalcuDB.get(str).equalsIgnoreCase("")) || (EqnActualMap2DB.get(str) == null) || (EqnActualMap2DB.get(str).equalsIgnoreCase("")))) {
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " EqnUnderTest  =" + EqnUnderTestDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " Order  =" + OrderTestDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " Exprn         =" + EqnExprnDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ActualMap1    =" + EqnActualMap1DB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ExpectedMap1  =" + EqnExpectedMap1DB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ActualCalcu   =" + EqnActualCalcuDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ExpectedCalcu =" + EqnExpectedCalcuDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ActualMap2    =" + EqnActualMap2DB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " ExpectedMap2  =" + EqnExpectedMap2DB.get(str) + ConsoleColors.RESET);
//
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " HighLevel Test Status  =" + TestCasesHighLevelDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " LowLevel String Test  =" + TestCaseStrDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " LowLevel Value Test  =" + TestCaseValDB.get(str) + ConsoleColors.RESET);
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " LowLevel Conformal Mapping Test  =" + TestCaseConformalValDB.get(str) + ConsoleColors.RESET);
//
//                System.out.println(ConsoleColors.RED + " TestCase=" + str + " NULL Generated " + ConsoleColors.RESET);
//                System.out.print(System.lineSeparator());
//                i++;
//            }
//        }
//        System.out.println("Incomplete NULL Testing Summary: Number of Test Cases=" + i);
        ruleAnalytics = null;
        //ruleAnalyticsFailed = null;
//        testResultsPassed = null;
//        testResultsFailed = null;
    }
    public static void DiffSingleHighTestCase(int MaxOrder1, String Exprn, String MapType, String IntegrORDiffr) {
        Map<String, Double> variables = new HashMap<>();
        MathsContxtLAv.SimpleExpression expSimpleMap1 = (() -> "");
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsContxtLAv.SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.DiffExpr exp = (() -> "");
        MyFuncExpress();
        MyFuncDiff();
        MyFuncSimple();

        String Constant = "C";

        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";

        double ExprnexpValue = 0;
        double ExprnexpValue1 = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        double DblexpValueMap3 = 0;

        StageMapping = "";
        Order = 1;

        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " TestCaseFile=" + TestCaseFile + " Section=" + Section + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Regression Status : Test Case should be " + EqnRegressionDiffStatus + ConsoleColors.RESET);

        for (double x = 1.0, y = 7.0; (Order < MaxOrder1); y++, /*x++,*/ Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                TestCasePassConformalValFlag = false;
                Exprn = eatAll(Exprn, ' ');
                variables.put(DiffWithRespTo, x);
                variables.put("y", y);
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
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                MapType = "Map1";
                if (Trace.contains("Map1")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                //}
                ChaosPrevention();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                expSimpleMap1 = parseSimple(Exprn, variables, DiffWithRespTo, "Map1", IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println("main: " + DiffWithRespTo + "=" + x + " After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                expValue = MathsExpressionParser.parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(" main:Expn Value=" + ExprnexpValue + "  x=" + x + " " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn);
                //}
                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
                if ((DblexpValueMap1 < 0) && (ExprnexpValue < 0)) {
                    DblexpValueMap3 = DblexpValueMap1 * -1.0;
                    ExprnexpValue1 = ExprnexpValue * -1.0;
                }
                WrongAnswerFlagMap1 = false;
                if (Order == 1) {
                    WrongAnswerMap1(EqnUnderTest, variables, EqnSolArrayMap1[Order],MaxOrder1);
                    if ((WrongAnswerFlagMap1 == true) && (Order == 1)) {
                        WrongAnswerCountMap1++;
                        //if (!DetailedFailureSummaryAloneFlag) {
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP1" + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer1(EqnUnderTest)=" + EqnUnderTest + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer Map(EqnSolArrayMap1[Order])=" + EqnSolArrayMap1[Order] + ConsoleColors.RESET);
                        //}
                        WrongAnsTestCasesMap1.put(MaxIndexWrongAnsMap1, TestCase + " ;");
                        MaxIndexWrongAnsMap1++;
                    }
                }
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Result) (Exprn Value)=" + DblexpValueMap1 + " StrexpSimpleExpressMap1=" + StrexpSimpleExpressMap1);
                //}
                StageMapping = "Differentiation";
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:Differentiation VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                exp = DiffrIntegrSep.parseDiff(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.DiffExpr();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(" main:Result(Diff Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                //}
                StageMapping = "Differentiation Mapping";
                MapType = "Map2";
                ChaosPrevention();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                if (Trace.contains("Map2")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " StrexpDiffExpress=" + StrexpDiffExpress + ConsoleColors.RESET);
                //}
                expSimpleMap2 = parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, "Map2", IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimpleMap2.SimpleExpr();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + " main:Test Case Status=" + " MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpDiffValue = expValue.eval();
                WrongAnswerFlagCalculus1 = false;
                if (Order == 1) {
                    WrongAnswerCalculus1(EqnSolArrayDiffAlone[Order], variables, EqnSolArrayMap2[Order]);
                    if ((WrongAnswerFlagCalculus1 == true)) {
                        WrongAnswerCountCalculus1++;
                        //if (!DetailedFailureSummaryAloneFlag) {
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answe2(EqnSolArrayDiffAlone[Order])=" + EqnSolArrayDiffAlone[Order] + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap2[Order])=" + EqnSolArrayMap2[Order] + ConsoleColors.RESET);
                        //}
                        WrongAnsTestCasesCalculus1.put(MaxIndexWrongAnsCalculus1, TestCase + " ,");
                        MaxIndexWrongAnsCalculus1++;
                    }
                }
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Diff Value)=" + DblexpDiffValue);
                System.out.println(" main:Result(Simplified Diff Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                //}
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap2 = expValue.eval();
                WrongAnswerFlagMap2 = false;
                if (Order == 1) {
                    WrongAnswerMap2(EqnSolArrayDiffAlone[Order], variables, EqnSolArrayMap2[Order],MaxOrder1);
                    if ((WrongAnswerFlagMap2 == true)) {
                        WrongAnswerCountMap2++;
                        //if (!DetailedFailureSummaryAloneFlag) {
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer3(EqnSolArrayDiffAlone[Order])=" + EqnSolArrayDiffAlone[Order] + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap2[Order])=" + EqnSolArrayMap2[Order] + ConsoleColors.RESET);
                        //}
                        WrongAnsTestCasesMap2.put(MaxIndexWrongAnsMap2, TestCase + " ,");
                        MaxIndexWrongAnsMap2++;
                    }
                }
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Diff Value)=" + expValue.eval());
                //}
                System.out.print(System.lineSeparator());

//                if ((StrexpSimpleExpressMap1==null) ||(StrexpSimpleExpressMap1.equalsIgnoreCase(""))||((StrexpDiffExpress==null) ||(StrexpDiffExpress.equalsIgnoreCase("")) ) ||(StrexpSimpleExpressMap2==null) ||(StrexpSimpleExpressMap2.equalsIgnoreCase("")) ){
//                    TestCasePassHighLevelFlag = false;
//                }else 
                if (PassFailTestCaseString(TestCase, Order, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order],"","","")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL STRING TEST Complete" + ConsoleColors.RESET);
                    if (TestCasePassHighLevelFlag == true) {
                        TestCasePassHighLevelFlag = false;
                    }
                }

                if (PassFailTestCaseValueStrict(TestCase, Order, MaxOrder1,"Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:" + Pragma + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                    TestCasePassHighLevelFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Complete" + ConsoleColors.RESET);
                    TestCasePassValFlag = false;
                    TestCasePassHighLevelFlag = false;
                }
                if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                    TestCasePassConformalValFlag = ConformalMapTestCaseDiff(TestCase, Order, Exprn, expSimpleMap1.SimpleExpr(), exp.DiffExpr(), expSimpleMap2.SimpleExpr(), EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order], variables, DiffWithRespTo);
                }
//                if ((TestCasePassValFlag != true) && (PassFailTestCaseValueEasy(TestCase, Order, "Diff", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x))) {
//                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                    TestCasePassHighLevelFlag = true;
//                }
                if (TestCasePassConformalValFlag == true) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass Conformal Map TEST" + ConsoleColors.RESET);
                } else if ((TestCasePassStrFlag != true) || (TestCasePassValFlag != true)) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Conformal Map TEST Not Executed" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL Conformal Map TEST " + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    System.out.println(ConsoleColors.BLUE + "Super Test Answer Checks" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) /* && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true)*/) {
                    TestCasePassHighLevelFlag = true;//DO Nothing as Test Cases Passes
                } else if (!((TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
//                    if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (Order >= 2) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
//                        HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
//                    } else if (TestCaseFailCoarseReportingFlag == false) {
//                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
//                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1) && (Temp != null)) {
//                        //HashVal = "TestCase=" + TestCase + "," + ":Order=" + (Order) ;
//                        HashVal = Temp + "," + "(j==" + TestCase + ")";
//                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Temp != null)) {
//                        //HashVal = Temp +"," + ":Order=" + (Order) ;
//                        HashVal = Temp;
//                    } else {
//                        HashVal = "(j==" + TestCase + ")";
//                    }
                    String HashVal1 = "";
                    if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                        HashVal1 = Temp + "," + ":Order=" + (Order);
                    } else {
                    HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal1);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else {
                    TestCasePassHighLevelFlag = true;
                }
                if (!FailTestCaseStringDiagnostic(TestCase, Order, MaxOrder1, "Diff", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap1[Order], EqnSolArrayDiffAlone[Order], EqnSolArrayMap2[Order])) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Diagnostic Complete" + ConsoleColors.RESET);
                }
                if ((TestCasePassHighLevelFlag == false) && (Order == (MaxOrder1-1))
                        && (EqnSolArrayMap1[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap2[Order - 1].equalsIgnoreCase(""))
                        && ((StrexpSimpleExpressMap1.equalsIgnoreCase("")) || (StrexpDiffExpress.equalsIgnoreCase("")) || (StrexpSimpleExpressMap2.equalsIgnoreCase("")))
                        && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                    NullTestCasesFlag = true;
                    if (!NullTestCasesFlag) {
                        FailedTestCount++;
                    }
                    TestCasePassHighLevelFlag = false;
                    NullTestCases++;
                    NULLStrTestCases.put(NullTestCases, "" + TestCase);
                    NullTestCasesFlag = false;
                }
                if (TestCasePassHighLevelFlag == false) {
                    ruleAnalytics.recordSummary("" + TestCase, Order, EqnUnderTest, Exprn, StrexpSimpleExpressMap1, EqnSolArrayMap1[Order], StrexpDiffExpress, EqnSolArrayDiffAlone[Order], StrexpSimpleExpressMap2, EqnSolArrayMap2[Order], TestCasePassHighLevelFlag, TestCasePassStrFlag, TestCasePassValFlag, TestCasePassConformalValFlag);
                    break;
                }
                Exprn = StrexpSimpleExpressMap2;
                System.out.print(System.lineSeparator());
            } catch (Exception MyException) {
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                MyException.initCause(cause);
                if (MyException.getCause() != null) {
                    ExceptionStringDB.put(MaxIndexExcept, TestCase + ":" + MyException.getMessage());
                }
                System.out.println(ConsoleColors.RED + "TestCase " + TestCase + " Failed at Order=" + Order + " due to Exception at Stage=" + StageMapping + "." + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
                MyException.printStackTrace();
                String Temp = FailedTestCases.get(MaxIndexFail);
                String HashVal = "";
                if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if (TestCaseFailCoarseReportingFlag == false) {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1)) {
                    HashVal = Temp;
                } else if ((TestCaseFailCoarseReportingFlag == true)) {
                    HashVal = Temp;
                }
                FailedTestCases.put(MaxIndexFail, HashVal);
                String Temp1 = ExceptionTestCases.get(MaxIndexExcept);
                String HashVal1 = "";
                if ((Temp1 != null) && (!Temp1.equalsIgnoreCase(""))) {
                        HashVal1 = Temp1 + "," + ":Order=" + (Order);
                    } else {
                    HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                    }
                ExceptionTestCases.put(MaxIndexExcept, HashVal1);
                MaxIndexExcept++;
                TestCasePassHighLevelFlag = false;
                break;
            }
        }
        System.out.print(System.lineSeparator());

    }

    public static void IntegralHighSingleTest(int MaxOrder1, String Exprn, String MapType, String IntegrORDiffr) {
//        Map<String, Double> variables = new HashMap<>();
//        JavaAiGen.SymbolicTerm expSimpleMap1 = (() -> "");
//        MathsContxtLAv.Expression expValue = (() -> Double.NaN);;
//        JavaAiGen.SymbolicTerm expSimpleMap2 = (() -> "");
//        DiffrIntegrSep.IntegrExpr exp = (() -> "");
        Map<String, Double> variables = new HashMap<>();
        MathsContxtLAv.SimpleExpression expSimpleMap1 = (() -> "");
        MathsExpressionParser.Expression expValue = (() -> Double.NaN);
        MathsContxtLAv.SimpleExpression expSimpleMap2 = (() -> "");
        DiffrIntegrSep.IntegrExpr exp = (() -> "");
        
        MyFuncExpress();
        MyFuncIntegr();
        MyFuncSimple();

        String Constant = "C";
        String StrexpSimpleExpressMap1 = "";
        String StrexpDiffExpress = "";
        String StrexpSimpleExpressMap2 = "";
        String myOrder = "";
        double ExprnexpValue = 0;
        double DblexpValueMap1 = 0;
        double DblexpDiffValue = 0;
        double DblexpValueMap2 = 0;
        Order = 1;
        System.out.println(ConsoleColors.YELLOW + "Test Case " + TestCase + " EndTestCase=" + EndTestCase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case " + TestCase + " TestCaseFile=" + TestCaseFile + " Section=" + Section + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Exprn=" + Exprn + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseName + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Test Case Name=" + TestCaseMatrixID + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "Integral Regression Status : Test Case should be " + EqnRegressionIntegreStatus + ConsoleColors.RESET);
        Order = 1;
        StageMapping = "";
        for (double x = 1.0, y = 7; Order < MaxOrder1; y++, Order++) {
            try {
                TestCasePassStrFlag = false;
                TestCasePassValFlag = false;
                TestCasePassConformalValFlag = false;
                Exprn = eatAll(Exprn, ' ');
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
                variables.put("i", 1.0);
                variables.put("E1", 1.0);
                variables.put(Constant, 5.0);
                StageMapping = "Basic Mapping";
                MapType = "Map1";
                //if (!DetailedFailureSummaryAloneFlag)
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Exprn=" + Exprn + " Order=" + myOrder);
                ChaosPrevention();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 START VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                if (Trace.contains("Map1")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                if ((Trace.contains("Map1")) && (AITestResultsGenFlag)) {
                    SetDevFlagsAI(true, "Silent", false);
                } else if (AITestResultsGenFlag) {
                    SetDevFlagsAI(false, "Silent", false);
                }
                //expSimpleMap1 = JavaAiGen.parseBaseSimple(Exprn, myOrder, MapType);
                expSimpleMap1 = MathsContxtLAv.parseSimple(Exprn, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap1 = expSimpleMap1.SimpleExpr();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println("main: " + DiffWithRespTo + "=" + x + " After Map1:Basic Simple Exprn=" + StrexpSimpleExpressMap1);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP1 END VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                expValue = parse(Exprn, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                ExprnexpValue = expValue.eval();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(" main:Result(Expn Value)=" + ExprnexpValue + "  x=" + x + " " + DiffWithRespTo + "=" + x);
                //}
                expValue = parse(StrexpSimpleExpressMap1, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Off);
                DblexpValueMap1 = expValue.eval();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Basic Simple (Exprn Value)=" + DblexpValueMap1);
                //}

                StageMapping = "Integration";
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:Integration VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                exp = DiffrIntegrSep.parseIntegr(StrexpSimpleExpressMap1, variables, DiffWithRespTo, MapType, IntegrORDiffr);
                StrexpDiffExpress = exp.IntegrExpr();
                System.out.println(" main:Result(Integral Equation)(" + Order + " th order)=> " + StrexpDiffExpress);
                //' Convert Both Answers to POSITIVE DOMAIN as For Nominal Answer of -23.0 , -24 or -22 is allowed
                if ((DblexpValueMap1 < 0) && (ExprnexpValue < 0)) {
                    DblexpValueMap1 = DblexpValueMap1 * -1.0;
                    ExprnexpValue = ExprnexpValue * -1.0;
                }
                WrongAnswerFlagMap1 = false;
                WrongAnswerMap1(Exprn, variables, EqnSolArrayMap3[Order],MaxOrder1);
                if ((WrongAnswerFlagMap1 == true) && (Order == 1)) {
                    WrongAnswerCountMap1++;
                    //if (!DetailedFailureSummaryAloneFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP3" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer1(EqnUnderTest)=" + EqnUnderTest + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer(EqnSolArrayMap3[Order])=" + EqnSolArrayMap3[Order] + ConsoleColors.RESET);
                    //}
                    WrongAnsTestCasesMap1.put(MaxIndexWrongAnsMap1, TestCase + " ,");
                    MaxIndexWrongAnsMap1++;
                }
                StageMapping = "Integration Mapping";
                MapType = "Map2";
                ChaosPrevention();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(ConsoleColors.BLUE + "main:MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP2 START VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                if (Trace.contains("Map2")) {
                    SetDevFlags(true, "Silent", false);
                } else {
                    SetDevFlags(false, "Silent", false);
                }
                if ((Trace.contains("Map2")) && (AITestResultsGenFlag)) {
                    SetDevFlagsAI(true, "Silent", false);
                } else if (AITestResultsGenFlag) {
                    SetDevFlagsAI(false, "Silent", false);
                }
                //expSimpleMap2 = JavaAiGen.parseBaseSimple(StrexpDiffExpress, myOrder, MapType);
                expSimpleMap2 = MathsContxtLAv.parseSimple(StrexpDiffExpress, variables, DiffWithRespTo, MapType, IntegrORDiffr, HideInRecurseFlag, GBLSilent, GBLMyLogLevel);
                StrexpSimpleExpressMap2 = expSimpleMap2.SimpleExpr();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println(" main:Result(Simplified Integral Equation)(" + Order + " th order)=> " + StrexpSimpleExpressMap2);
                System.out.println(ConsoleColors.BLUE + "main:MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "main:MAP2 END VERBOSE IF SET" + ConsoleColors.RESET);
                //}
                expValue = parse(StrexpDiffExpress, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Info);
                DblexpDiffValue = expValue.eval();
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Integral Value)=" + DblexpDiffValue);
                //}
                expValue = parse(StrexpSimpleExpressMap2, variables, DiffWithRespTo, false, "Silent", MathsExpressionParser.LogLevel.Info);
                DblexpValueMap2 = expValue.eval();
                WrongAnswerFlagCalculus1 = false;
                if (Order == 1) {
                    WrongAnswerCalculus1(EqnSolArrayIntegrAlone[Order], variables, EqnSolArrayMap4[Order]);
                    if ((WrongAnswerFlagCalculus1 == true)) {
                        WrongAnswerCountCalculus1++;
                        //if (!DetailedFailureSummaryAloneFlag) {
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP2" + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer2(EqnSolArrayIntegrAlone[Order])=" + EqnSolArrayIntegrAlone[Order] + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap4[Order])=" + EqnSolArrayMap4[Order] + ConsoleColors.RESET);
                        //}
                        WrongAnsTestCasesCalculus1.put(MaxIndexWrongAnsCalculus1, TestCase + " ,");
                        MaxIndexWrongAnsCalculus1++;
                    }
                }
                WrongAnswerFlagMap2 = false;
                WrongAnswerMap2(EqnSolArrayIntegrAlone[Order], variables, EqnSolArrayMap4[Order],MaxOrder1);
                if ((WrongAnswerFlagMap2 == true) && (Order == 1)) {
                    WrongAnswerCountMap2++;
                    //if (!DetailedFailureSummaryAloneFlag) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "WRONG ANSWER MAP4" + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given Answer2(EqnSolArrayIntegrAlone[Order])=" + EqnSolArrayIntegrAlone[Order] + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Given AnswerMap(EqnSolArrayMap4[Order])=" + EqnSolArrayMap4[Order] + ConsoleColors.RESET);
                    //}
                    WrongAnsTestCasesMap2.put(MaxIndexWrongAnsMap2, TestCase + " ,");
                    MaxIndexWrongAnsMap2++;
                }
                //if (!DetailedFailureSummaryAloneFlag) {
                System.out.println("main: " + DiffWithRespTo + "=" + x + " Result(Simplified Integral Value)=" + expValue.eval());
                //}
                //Usage.FInverseEqn=FInverseLagrangeBurmann( Exprn, DiffWithRespTo, MaxOrder1,x, "",  "", '/', 12);
                //Usage.FInverseEqn = FInverseLagrangeBurmannLowLevel(Exprn, DiffWithRespTo, MaxOrder1, x, (x +(10 - x) / 10), "", "", '/', 4);
                //System.out.println("main: FInverse:" + "x" + "=" + UsageCalculus.FInverseEqn);

                System.out.print(System.lineSeparator());

//                if ((StrexpSimpleExpressMap1==null) ||(StrexpSimpleExpressMap1.equalsIgnoreCase(""))||((StrexpDiffExpress==null) ||(StrexpDiffExpress.equalsIgnoreCase("")) ) ||(StrexpSimpleExpressMap2==null) ||(StrexpSimpleExpressMap2.equalsIgnoreCase("")) ){
//                    TestCasePassHighLevelFlag = false;
//                }else 
                
                if (PassFailTestCaseString(TestCase, Order, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order],"","","")) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail STRING TEST Complete" + ConsoleColors.RESET);
                    TestCasePassStrFlag = false;
                }

                if (PassFailTestCaseValueStrict(TestCase, Order,MaxOrder1, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x)) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST CompletePragma:Strict" + ConsoleColors.RESET);
                    TestCasePassValFlag = true;
                    TestCasePassHighLevelFlag = true;
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Fail VALUE TEST Complete" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) || (TestCasePassValFlag == true)) {
                    TestCasePassConformalValFlag = ConformalMapTestCaseIntegr(TestCase, Order, Exprn, expSimpleMap1.SimpleExpr(), exp.IntegrExpr(), expSimpleMap2.SimpleExpr(), EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order], variables, DiffWithRespTo);
                }
//                if ((TestCasePassValFlag != true) && (PassFailTestCaseValueEasy(TestCase, Order, "Integre", Exprn, ExprnexpValue, DblexpValueMap1, DblexpDiffValue, DblexpValueMap2, StrexpDiffExpress, variables, x))) {
//                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass VALUE TEST Complete:Pragma:Loose" + ConsoleColors.RESET);
//                    TestCasePassValFlag = true;
//                    TestCasePassHighLevelFlag = true;
//                }
                if (TestCasePassConformalValFlag == true) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Pass Conformal Map TEST" + ConsoleColors.RESET);
                } else if ((TestCasePassStrFlag != true) || (TestCasePassValFlag != true)) {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "Conformal Map TEST Not Executed" + ConsoleColors.RESET);
                } else {
                    System.out.println(ConsoleColors.RED + " main:Test Case Status=" + "FAIL Conformal Map TEST " + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) && (TestCasePassValFlag == true)) {
                    System.out.println(ConsoleColors.BLUE + "Super Test Answer Checks" + ConsoleColors.RESET);
                }
                if ((TestCasePassStrFlag == true) /* && (TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true)*/) {
                    TestCasePassHighLevelFlag = true;//DO Nothing as Test Cases Passes
                } else if (!((TestCasePassValFlag == true) && (TestCasePassConformalValFlag == true))) {
                    String Temp = FailedTestCases.get(MaxIndexFail);
                    String HashVal = "";
//                    if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (Order >= 2) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
//                        HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
//                    } else if (TestCaseFailCoarseReportingFlag == false) {
//                        HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag + ":ConfValFlag=" + TestCasePassConformalValFlag;
//                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1) && (Temp != null)) {
//                        //HashVal = "TestCase=" + TestCase + "," + ":Order=" + (Order) ;
//                        HashVal = Temp + "(j==" + TestCase + ")";
//                    } else if ((TestCaseFailCoarseReportingFlag == true) && (Temp != null)) {
//                        //HashVal = Temp +"," + ":Order=" + (Order) ;
//                        HashVal = Temp;
//                    } else {
//                        HashVal = "(j==" + TestCase + ")";
//                    }
                    String HashVal1 = "";
                    if ((Temp != null) && (!Temp.equalsIgnoreCase(""))) {
                        HashVal1 = Temp + "," + ":Order=" + (Order);
                    } else {
                    HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                    }
                    FailedTestCases.put(MaxIndexFail, HashVal1);
                    //i=MaxOrder1;
                    TestCasePassHighLevelFlag = false;
                } else {
                    TestCasePassHighLevelFlag = true;
                }
                if (!FailTestCaseStringDiagnostic(TestCase, Order, MaxOrder1, "Integre", Exprn, StrexpSimpleExpressMap1, StrexpDiffExpress, StrexpSimpleExpressMap2, EqnUnderTest, EqnSolArrayMap3[Order], EqnSolArrayIntegrAlone[Order], EqnSolArrayMap4[Order])) {
                    System.out.println(ConsoleColors.GREEN + " main:Test Case Status=" + "Diagnostic Complete" + ConsoleColors.RESET);
                }
                if ((TestCasePassHighLevelFlag == false) && (Order == (MaxOrder1-1))
                        && (EqnSolArrayMap4[Order - 1].equalsIgnoreCase("")) && (EqnSolArrayMap3[Order - 1].equalsIgnoreCase(""))
                        && ((StrexpSimpleExpressMap1.equalsIgnoreCase("")) || (StrexpDiffExpress.equalsIgnoreCase("")) || (StrexpSimpleExpressMap2.equalsIgnoreCase("")))
                        && (KnownIssueTestCasesFlag == false) && (CoreKnownIssuesTestCasesFlag == false)) {
                    NullTestCasesFlag = true;
                    if (!NullTestCasesFlag) {
                        FailedTestCount++;
                    }
                    TestCasePassHighLevelFlag = false;
                    NullTestCases++;
                    NULLStrTestCases.put(NullTestCases, "" + TestCase);
                    NullTestCasesFlag = false;
                }
                if (TestCasePassHighLevelFlag == false) {
                    ruleAnalytics.recordSummary("" + TestCase, Order, EqnUnderTest, Exprn,StrexpSimpleExpressMap1, EqnSolArrayMap3[Order], StrexpDiffExpress, EqnSolArrayIntegrAlone[Order], StrexpSimpleExpressMap2, EqnSolArrayMap4[Order], TestCasePassHighLevelFlag, TestCasePassStrFlag, TestCasePassValFlag, TestCasePassConformalValFlag);
                    break;
                }
                Exprn = StrexpSimpleExpressMap2;
                System.out.print(System.lineSeparator());
            } catch (Exception MyException) {
                System.out.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
                MyException.initCause(cause);
                if (MyException.getCause() != null) {
                    ExceptionStringDB.put(MaxIndexExcept, TestCase + ":" + MyException.getMessage().toString());
                }
                System.out.println(ConsoleColors.RED + "TestCase " + TestCase + " Failed at Order=" + Order + " due to Exception at Stage=" + StageMapping + "." + ConsoleColors.RESET);
                System.out.print(System.lineSeparator());
                MyException.printStackTrace();
                String Temp = FailedTestCases.get(MaxIndexFail);
                String HashVal = "";
                if ((TestCaseFailCoarseReportingFlag == false) && (Temp != null) && (!Temp.equalsIgnoreCase("")) && (!Temp.contains("Section"))) {
                    HashVal = Temp + "," + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == false)) {
                    HashVal = "TestCase=" + TestCase + ":Order=" + (Order) + ":Str=" + TestCasePassStrFlag + ":Val=" + TestCasePassValFlag;
                } else if ((TestCaseFailCoarseReportingFlag == true) && (Order == 1)) {
                    HashVal = Temp;
                } else {
                    HashVal = Temp;
                }
                FailedTestCases.put(MaxIndexFail, HashVal);
                String Temp1 = ExceptionTestCases.get(MaxIndexExcept);
                String HashVal1 = "";
                if ((Temp1 != null) && (!Temp1.equalsIgnoreCase(""))) {
                    HashVal1 = Temp1 + "," + ":Order=" + (Order);
                } else {
                    HashVal1 = "TestCase=" + TestCase + ":Order=" + (Order);
                }
                ExceptionTestCases.put(MaxIndexExcept, HashVal);
                MaxIndexExcept++;
                TestCasePassHighLevelFlag = false;
                break;
            }
        }
        System.out.print(System.lineSeparator());
    }
}
