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

import static Calculus.UsageCalculus.DiffWithRespTo;
import static Calculus.UsageCalculus.DiffWithRespToDB;
import static Calculus.UsageCalculus.EqnUnderTestDB;
import static Calculus.UsageCalculus.EqnActualMap1DB;
import static Calculus.UsageCalculus.EqnExpectedMap1DB;
import static Calculus.UsageCalculus.EqnActualCalcuDB;
import static Calculus.UsageCalculus.EqnExpectedCalcuDB;
import static Calculus.UsageCalculus.EqnActualMap2DB;
import static Calculus.UsageCalculus.EqnExpectedMap2DB;
import static Calculus.UsageCalculus.EqnExprnDB;
import static Calculus.UsageCalculus.OrderTestDB;
import static Calculus.UsageCalculus.TestCaseConformalValDB;
import static Calculus.UsageCalculus.TestCasePassConformalValFlag;
import static Calculus.UsageCalculus.TestCasePassHighLevelFlag;
import static Calculus.UsageCalculus.TestCasePassStrFlag;
import static Calculus.UsageCalculus.TestCasePassValFlag;
import static Calculus.UsageCalculus.TestCaseStrDB;
import static Calculus.UsageCalculus.TestCaseValDB;
import static Calculus.UsageCalculus.TestCasesHighLevelDB;

import java.util.*;
import java.util.stream.Collectors;

public class RuleAnalytics {

    // Records detailed reasoning steps per inference
    private List<Map<String, String>> reasoningData = new ArrayList<>();

    // Maps testCaseId -> (equation -> comma-separated rules fired)
    private Map<String, Map<String, String>> testResults = new HashMap<>();

    // Tracks pass/fail per testCaseId
    public static Map<String, Boolean> testCaseStatus = new HashMap<>();
    public static TreeMap<Integer , Boolean> sortedTestCases= new TreeMap<>();
    
    // Section definitions for Pareto analysis (id ranges)
    public static Map<String, int[]> sectionRanges = new LinkedHashMap<>();

    /** Initialize static sectionRanges once at startup */
    public static void Init() {
        sectionRanges.put("IsolationTestCases", new int[]{1000, 1030});
        sectionRanges.put("InfinityNaNTestCases", new int[]{2000, 2019});
        sectionRanges.put("InfiniteLoops", new int[]{3000, 3005});
        sectionRanges.put("SanityTestCases", new int[]{4000, 4032});
        sectionRanges.put("UnitTestCases", new int[]{5019, 5048});
        sectionRanges.put("Names", new int[]{10001, 10010});
        sectionRanges.put("Coefficients", new int[]{20001, 20069});
        sectionRanges.put("Exponent", new int[]{30001, 30011});
        sectionRanges.put("SignedX", new int[]{40001, 40035});
        sectionRanges.put("IndConstant", new int[]{50001, 50093});
        sectionRanges.put("Parentheses", new int[]{80000, 80105});
        sectionRanges.put("FunctionTestCases", new int[]{90000, 90015});
        sectionRanges.put("FunctionArgumentTestCases",new int[]{100000, 100004});
        sectionRanges.put("SoftwareEngg", new int[]{110001, 110028});
    }

    /**
     * Called at each inference step to record the rule applied.
     */
    public void recordReasoning(String testCaseId,
                                String equation,
                                String actualRuleUsed,
                                String highLevelRule,
                                String parserType) {
        Map<String,String> entry = new HashMap<>();
        entry.put("TestCase", testCaseId);
        entry.put("Equation", equation);
        entry.put("ActualRuleUsed",actualRuleUsed);
        entry.put("HighLevelRule", highLevelRule);
        entry.put("ParserType", parserType);
        reasoningData.add(entry);
                
        testResults
          .computeIfAbsent(testCaseId, k -> new HashMap<>())
          .merge(equation, actualRuleUsed, (oldVal,newVal) -> oldVal + ", " + newVal);
    }

    /** Records whether a testCase passed (true) or failed (false). */
    public void setTestCaseStatus(String testCaseId, boolean passed) {
        testCaseStatus.put(testCaseId, passed);
        sortedTestCases.put(Integer.parseInt(testCaseId), passed);
    }

    /**
     * Stores equation, actual vs expected maps & calculus results into UsageCalculus DBs.
     */
    public void recordSummary(String testCaseId,int Order,
                              String equation,
                              String Exprn,
                              String actualMap1,
                              String expectedMap1,
                              String actualCalcu,
                              String expectedCalcu,
                              String actualMap2,
                              String expectedMap2, boolean TestCasePassHighLevelFlag, boolean TestCaseStrFlag, boolean TestCaseValFlag, boolean TestCaseConformalValFlag) {
        EqnUnderTestDB.put(testCaseId, equation);
        OrderTestDB.put(testCaseId, Order);
        DiffWithRespToDB.put(testCaseId,DiffWithRespTo);
        EqnExprnDB.put(testCaseId, Exprn);
        EqnActualMap1DB.put(testCaseId, actualMap1);
        EqnExpectedMap1DB.put(testCaseId, expectedMap1);
        EqnActualCalcuDB.put(testCaseId, actualCalcu);
        EqnExpectedCalcuDB.put(testCaseId, expectedCalcu);
        EqnActualMap2DB.put(testCaseId, actualMap2);
        EqnExpectedMap2DB.put(testCaseId, expectedMap2);
        
        TestCasesHighLevelDB.put(testCaseId, TestCasePassHighLevelFlag);
        TestCaseStrDB.put(testCaseId, TestCaseStrFlag);
        TestCaseValDB.put(testCaseId, TestCaseValFlag);
        TestCaseConformalValDB.put(testCaseId, TestCaseConformalValFlag);
        
    }

    /** Summarizes rule-usage across all test cases. */
    public Map<String, Integer> analyzeUsageFrequency() {
        Map<String,Integer> freq = new HashMap<>();
        for (var eqMap : testResults.values()) {
            for (String termString : eqMap.values()) {
                for (String rule : termString.split(",\\s*")) {
                    freq.merge(rule, 1, Integer::sum);
                }
            }
        }
        return freq;
    }

    /** Counts rule-usage but only in passed test cases. */
    public Map<String, Integer> analyzePassedFrequency() {
        Map<String,Integer> passedFreq = new HashMap<>();
        for (var e : testCaseStatus.entrySet()) {
            if (e.getValue()) {
                for (String termString :
                     testResults.getOrDefault(e.getKey(), Collections.emptyMap()).values()) {
                    for (String rule : termString.split(",\\s*")) {
                        passedFreq.merge(rule, 1, Integer::sum);
                    }
                }
            }
        }
        return passedFreq;
    }

    /** Counts rule-usage but only in failed test cases. */
    public Map<String, Integer> analyzeFailureFrequency() {
        Map<String,Integer> failFreq = new HashMap<>();
        for (var e : testCaseStatus.entrySet()) {
            if (!e.getValue()) {
                for (String termString :
                     testResults.getOrDefault(e.getKey(), Collections.emptyMap()).values()) {
                    for (String rule : termString.split(",\\s*")) {
                        failFreq.merge(rule, 1, Integer::sum);
                    }
                }
            }
        }
        return failFreq;
    }

    /**
     * Builds per-rule summary: frequency, passes, failures, failed testCaseIds.
     */
    public Map<String, Map<String, Object>> generateRuleSummary() {
        var usage = analyzeUsageFrequency();
        var passes = analyzePassedFrequency();
        var fails = analyzeFailureFrequency();

        // Collect testCaseIds where each rule caused a failure
        Map<String, Set<String>> failedCasesByRule = new HashMap<>();
        for (var e : testCaseStatus.entrySet()) {
            if (!e.getValue()) {
                for (String termString :
                     testResults.getOrDefault(e.getKey(), Collections.emptyMap()).values()) {
                    for (String rule : termString.split(",\\s*")) {
                        failedCasesByRule
                          .computeIfAbsent(rule, r -> new HashSet<>())
                          .add(e.getKey());
                    }
                }
            }
        }

        Map<String, Map<String,Object>> summary = new HashMap<>();
        for (String rule : usage.keySet()) {
            Map<String,Object> stats = new HashMap<>();
            stats.put("Frequency", usage.get(rule));
            stats.put("Passes", passes.getOrDefault(rule, 0));
            stats.put("Failures", fails.getOrDefault(rule, 0));
            stats.put("FailedTestCases", new ArrayList<>(failedCasesByRule.getOrDefault(rule, Set.of())));
            stats.put("NoOfTestCases", failedCasesByRule.getOrDefault(rule, Set.of()).size());
            summary.put(rule, stats);
        }
        return summary;
    }

    /** Concise snapshot of a map’s first 3 entries. */
    public static String summarizeMap(Map<String, String> map) {
        return map.entrySet().stream()
                  .limit(3)
                  .map(e -> e.getKey() + "=" + e.getValue())
                  .collect(Collectors.joining(
                      ", ", "{", map.size()>3 ? ", ...}" : "}" ));
    }

    /**
     * For each section range, counts how many test cases used each rule and how many failed.
     */
    public Map<String, Map<String, Map<String,Integer>>>
      summarizeRuleTestCaseMetricsBySection(Map<String,int[]> sectionRanges) {

        Map<String, Map<String, Map<String,Integer>>> out = new LinkedHashMap<>();

        for (var sec : sectionRanges.entrySet()) {
            String section = sec.getKey();
            int[] range = sec.getValue();
            Map<String, Map<String,Integer>> metrics = new HashMap<>();
            System.out.println("\n===== Reached 1 =====:section=" + section);
                
            for (String tcId : testCaseStatus.keySet()) {
                int NoOfTestCases=0;
                int id = Integer.parseInt(tcId);
                if (id < range[0] || id > range[1]) continue;
                boolean passed = testCaseStatus.get(tcId);
                var eqMap = testResults.getOrDefault(tcId, Collections.emptyMap());
                // unique rules per test case
                eqMap.values().stream()
                     .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                     .distinct()
                     .forEach(rule -> {
                        var m = metrics.computeIfAbsent(rule, k -> {
                            Map<String,Integer> mm = new HashMap<>();
                            mm.put("TotalTCsWithRule", 0);
                            mm.put("FailedTCsWithRule",0);
                            //mm.put("NoOfTestCases",0);
                            return mm;
                        });
                        m.put("TotalTCsWithRule", m.get("TotalTCsWithRule")+1);
                        if (!passed) {
                             m.put("FailedTCsWithRule", m.get("FailedTCsWithRule")+1);
                             //m.put("NoOfTestCases", m.get("NoOfTestCases")+1);
                        }
                     });
            }
            System.out.println("\n===== Reached 3 =====");
            out.put(section, metrics);
        }
        return out;
    }

    /**
     * For each section, flags rules whose failure ratio ≥ 0.8 (Pareto).
     */
    public Map<String, Map<String, Map<String,Object>>>
      generateSectionParetoByTestCase(Map<String,int[]> sectionRanges) {

        var secMetrics = summarizeRuleTestCaseMetricsBySection(sectionRanges);
        Map<String, Map<String,Map<String,Object>>> pareto = new LinkedHashMap<>();

        for (var secEntry : secMetrics.entrySet()) {
            String section = secEntry.getKey();
            Map<String,Map<String,Integer>> metrics = secEntry.getValue();
            Map<String,Map<String,Object>> flagged = new HashMap<>();

            for (var ruleEntry : metrics.entrySet()) {
                String rule = ruleEntry.getKey();
                int total = ruleEntry.getValue().get("TotalTCsWithRule");
                int failed = ruleEntry.getValue().get("FailedTCsWithRule");
                double ratio = total==0 ? 0.0 : (double)failed/total;

                //if (ratio >= 0.8) {
                    Map<String,Object> rec = new HashMap<>();
                    rec.put("TotalTCsWithRule", total);
                    rec.put("FailedTCsWithRule", failed);
                    rec.put("FailureRatio", ratio);
                    rec.put("Flagged", true);
                    //rec.put("NoOfTestCases", ruleEntry.getValue().get("NoOfTestCases") );
                    flagged.put(rule, rec);
                //}
            }
            if (!flagged.isEmpty()) {
                pareto.put(section, flagged);
            }
        }
        return pareto;
    }

    /**
     * Prints both the full rule summary and the section-Pareto summary.
     */
    public void printSummaries() {
        System.out.println("===== ✅ Complete Rule Summary =====");
        var summary = generateRuleSummary();

        for (var entry : summary.entrySet()) {
            String rule = entry.getKey();
            var stats = entry.getValue();
            int passes = (int) stats.getOrDefault("Passes", 0);
            int fails = (int) stats.getOrDefault("Failures", 0);
            int total = passes + fails;

            System.out.println("Rule: " + rule);
            System.out.println(" Frequency: " + stats.get("Frequency"));
            System.out.println(" Passes: " + passes);
            System.out.println(" Failures: " + fails);
            System.out.println(" Total Invocations:" + total);
            System.out.println(" FailedTestCases: " + stats.get("FailedTestCases"));
            System.out.println(" NoOfTestCases: " + stats.get("NoOfTestCases"));
            String NoOfTestCases=stats.get("FailedTestCases").toString();
            String[] TempData=NoOfTestCases.split(",");
            if (TempData.length > 1)
                System.out.println(" Number of FailedTestCases: " + TempData.length);
            else
                System.out.println(" Number of FailedTestCases: " + 0);
            System.out.println("------------------------------");
        }

        System.out.println("\n===== 📉 Pareto Summary (≥80% failures) =====");
        var pareto = generateSectionParetoByTestCase(sectionRanges);
        if (pareto.isEmpty()) {
            System.out.println("No rules reached the 80% failure threshold.");
        } else {
            for (var secEntry : pareto.entrySet()) {
                String section = secEntry.getKey();
                System.out.println("▶ Section: " + section);
                for (var ruleEntry : secEntry.getValue().entrySet()) {
                    String rule = ruleEntry.getKey();
                    var stats = ruleEntry.getValue();
                    System.out.println(" Rule: " + rule);
                    System.out.println(" TotalTCsWithRule: " + stats.get("TotalTCsWithRule"));
                    System.out.println(" FailedTCsWithRule (Number of Test Cases): " + stats.get("FailedTCsWithRule"));
                    System.out.println(" FailureRatio: " +
                        String.format("%.1f%%", 100 * (double) stats.get("FailureRatio")));
                    System.out.println(" Flagged: " + stats.get("Flagged"));
                    //System.out.println(" Section: " + stats.get("Section"));
                    //System.out.println(" Number of Test Cases: " + stats.get("NoOfTestCases"));
                    System.out.println(" ------------------------");
                }
            }
        }
    }
}
