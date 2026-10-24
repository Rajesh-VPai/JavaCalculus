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

import static Calculus.RuleAnalytics.sortedTestCases;
import static Calculus.UsageCalculus.DiffWithRespToDB;
import static Calculus.UsageCalculus.EqnActualCalcuDB;
import static Calculus.UsageCalculus.EqnActualMap1DB;
import static Calculus.UsageCalculus.EqnActualMap2DB;
import static Calculus.UsageCalculus.EqnDB;
import static Calculus.UsageCalculus.EqnDBIndex;
import static Calculus.UsageCalculus.EqnExpectedCalcuDB;
import static Calculus.UsageCalculus.EqnExpectedMap1DB;
import static Calculus.UsageCalculus.EqnExpectedMap2DB;
import static Calculus.UsageCalculus.EqnExprnDB;
import static Calculus.UsageCalculus.EqnUnderTestDB;
import static Calculus.UsageCalculus.ExceptionStringDB;
import static Calculus.UsageCalculus.ExceptionTestCases;
import static Calculus.UsageCalculus.FailAnsTestCases;
import static Calculus.UsageCalculus.FailAnswerCount;
import static Calculus.UsageCalculus.FailedCurrRun;
import static Calculus.UsageCalculus.FailedTestCases;
import static Calculus.UsageCalculus.FailedTestCount;
import static Calculus.UsageCalculus.FlippedBothTestCases;
import static Calculus.UsageCalculus.KnownIssues;
import static Calculus.UsageCalculus.KnownIssuesTestCases;
import static Calculus.UsageCalculus.MaxIndexExcept;
import static Calculus.UsageCalculus.NULLStrTestCases;
import static Calculus.UsageCalculus.NullTestCases;
import static Calculus.UsageCalculus.OrderTestDB;
import static Calculus.UsageCalculus.StaleAnsTestCases;
import static Calculus.UsageCalculus.StaleAnswerCount;
import static Calculus.UsageCalculus.TestCaseConformalValDB;
import static Calculus.UsageCalculus.TestCaseStrDB;
import static Calculus.UsageCalculus.TestCaseValDB;
import static Calculus.UsageCalculus.TestCasesHighLevelDB;
import static Calculus.UsageCalculus.ruleAnalytics;
import java.util.Map;

/**
 *
 * @author Rajehs V Pai
 */
public class SummariesPrint {
    
    public static void SummariesPrintmain(String AlgoDispStr){
        int k = 0;
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                k++;
            }
        }
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
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Map1: Total Wrong=" + MaxIndexWrongAnsMap1 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; y < MaxIndexWrongAnsMap1; y++) {
//            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesMap1.get(y) + ConsoleColors.RESET);
//            if ((y != 0) && (y % 5 == 0)) {
//                System.out.print(System.lineSeparator());
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Calculus1: Total Wrong=" + MaxIndexWrongAnsCalculus1 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; y < MaxIndexWrongAnsCalculus1; y++) {
//            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesCalculus1.get(y) + ConsoleColors.RESET);
//            if ((y != 0) && (y % 5 == 0)) {
//                System.out.print(System.lineSeparator());
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Map2: Total Wrong=" + MaxIndexWrongAnsMap2 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; y < MaxIndexWrongAnsMap2; y++) {
//            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesMap2.get(y) + ConsoleColors.RESET);
//            if ((y != 0) && (y % 5 == 0)) {
//                System.out.print(System.lineSeparator());
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": ByPassedTestCases TestCase Summary : Total ByPassed=" + MaxIndexByPassedTest + " ByPassed Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; y < MaxIndexByPassedTest; y++) {
//            System.out.print(ConsoleColors.RED + " " + ByPassed.get(y) + ConsoleColors.RESET);
//            if ((y != 0) && (y % 5 == 0)) {
//                System.out.print(System.lineSeparator());
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": MissedNumberTestCases TestCase Summary : Total MissedNumber=" + MaxIndexMissedNumberTest + " MissedNumber Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; (y < MaxIndexMissedNumberTest); y++) {
//            if (MissedNumber.get(y) != null) {
//                System.out.print(ConsoleColors.RED + " " + MissedNumber.get(y) + ", " + ConsoleColors.RESET);
//                if ((y != 0) && (y % 5 == 0)) {
//                    System.out.print(System.lineSeparator());
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
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
//        System.out.println(ConsoleColors.CYAN + AlgoDispStr + ": StaleAnswers TestCase Summary : Total StaleAnswerCount=" + StaleAnsTestCases.size() + " Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; (y <= StaleAnsTestCases.size()); y++) {
//            if ((StaleAnsTestCases.get(y) != null)) {
//                System.out.print(ConsoleColors.CYAN + " " + StaleAnsTestCases.get(y) + "," + ConsoleColors.RESET);
//                if ((y != 0) && (y % 10 == 0)) {
//                    System.out.print(System.lineSeparator());
//                }
//            }
//        }
//        System.out.print(System.lineSeparator()); 
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": FailedAnswers TestCase Summary : Total FailAnswerCount=" + FailAnsTestCases.size() + " Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; (y <= FailAnsTestCases.size()); y++) {
//            if ((FailAnsTestCases.get(y) != null)) {
//                System.out.print(ConsoleColors.BLUE + " " + FailAnsTestCases.get(y) + "," + ConsoleColors.RESET);
//                if ((y != 0) && (y % 10 == 0)) {
//                    System.out.print(System.lineSeparator());
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println("Failed/Stale Answer Summary:");
//        System.out.println("Stale Answer Summary:");
//        for (int y1 = 0; (StaleAnsTestCases != null) && (y1 <= StaleAnsTestCases.size()); y1++) {
//            if ((y1 < StaleAnsTestCases.size()) && (StaleAnsTestCases.get(y1) != null)) {
//                if ((StaleAnsTestCases.get(y1).contains("Section")) && (StaleAnsTestCases.get(y1).contains("Complete # of Stale Ans="))) {
//                    System.out.print(ConsoleColors.BLUE + StaleAnsTestCases.get(y1) + ConsoleColors.RESET);
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println("Failed Answer Summary:");
//        for (int y1 = 0; (FailAnsTestCases != null) && (y1 <= FailAnsTestCases.size()); y1++) {
//            if ((y1 < FailAnsTestCases.size()) && (FailAnsTestCases.get(y1) != null)) {
//                if ((FailAnsTestCases.get(y1).contains("Section")) && (FailAnsTestCases.get(y1).contains("Complete # of Fail Ans="))) {
//                    System.out.print(ConsoleColors.BLUE + FailAnsTestCases.get(y1) + ConsoleColors.RESET);
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println("Flip Data Summary:");
//        for (int y1 = 0; (FlippedBothTestCases != null) && (y1 <= FlippedBothTestCases.size()); y1++) {
//            if ((y1 < FlippedBothTestCases.size()) && (FlippedBothTestCases.get(y1) != null)) {
//                if ((FlippedBothTestCases.get(y1).contains("Section")) && (FlippedBothTestCases.get(y1).contains("Complete # of Both Flips="))) {
//                    System.out.print(ConsoleColors.BLUE + FlippedBothTestCases.get(y1) + ConsoleColors.RESET);
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Flipped Summary : " + " Failed Test Cases are:" + ConsoleColors.RESET);
//        for (int y2 = 0; (y2 <= FlippedBothTestCases.size()); y2++) {
//            if (FlippedBothTestCases.get(y2) != null) {
//                System.out.print(ConsoleColors.BLUE + " " + FlippedBothTestCases.get(y2) + ", " + ConsoleColors.RESET);
//                if ((y2 != 0) && (y2 % 5 == 0)) {
//                    System.out.print(System.lineSeparator());
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        //System.out.println("===== Rule Summary =====");
        // 3️⃣ Generate analytics summary after all test cases are processed
        //ruleAnalytics.printSummaries();

        //System.out.print(System.lineSeparator());

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
        int blockNum = 1;
        System.out.println("Detailed Failed Summary:Block:blockNum=" + blockNum + " i=" + i);
        for (/*String str : sortedTestCases.keySet()*/Map.Entry<Integer, Boolean> entry : sortedTestCases.entrySet()) {
            String str = "" + entry.getKey();
            if ((!entry.getValue()) && (i >= 0) && (i < 100)) {
                if ((str != null) && (!str.equalsIgnoreCase("")&&(EqnUnderTestDB.get(str)!=null)&&(DiffWithRespToDB.get(str) != null)) 
                        //&& (EqnExpectedMap1DB.get(str) != null) && (!EqnExpectedMap1DB.get(str).equalsIgnoreCase("")) 
                        //&& (EqnExpectedCalcuDB.get(str) != null) && (!EqnExpectedCalcuDB.get(str).equalsIgnoreCase("")) && (EqnExpectedMap2DB.get(str) != null) && (!EqnExpectedMap2DB.get(str).equalsIgnoreCase(""))
                        ) {
                    System.out.println(ConsoleColors.RED + " TestCase=" + str + " EqnUnderTest  =" + EqnUnderTestDB.get(str) + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " TestCase=" + str + " Order  =" + OrderTestDB.get(str) + "       " + " DiffWithRespTo=" +  DiffWithRespToDB.get(str) + ConsoleColors.RESET);
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

    }
    public static void SummariesPrintAns(String AlgoDispStr){
        int k = 0;
        for (int y = 0; (y < EqnDB.size()); y++) {
            String Temp = EqnDB.get(y);
            if ((Temp != null) && (Temp.contains(":Dup with"))) {
                k++;
            }
        }
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
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Map1: Total Wrong=" + MaxIndexWrongAnsMap1 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; y < MaxIndexWrongAnsMap1; y++) {
//            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesMap1.get(y) + ConsoleColors.RESET);
//            if ((y != 0) && (y % 5 == 0)) {
//                System.out.print(System.lineSeparator());
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Calculus1: Total Wrong=" + MaxIndexWrongAnsCalculus1 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; y < MaxIndexWrongAnsCalculus1; y++) {
//            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesCalculus1.get(y) + ConsoleColors.RESET);
//            if ((y != 0) && (y % 5 == 0)) {
//                System.out.print(System.lineSeparator());
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Wrong Answer TestCase Summary :Map2: Total Wrong=" + MaxIndexWrongAnsMap2 + " Wrong Answer Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; y < MaxIndexWrongAnsMap2; y++) {
//            System.out.print(ConsoleColors.RED + " " + WrongAnsTestCasesMap2.get(y) + ConsoleColors.RESET);
//            if ((y != 0) && (y % 5 == 0)) {
//                System.out.print(System.lineSeparator());
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": ByPassedTestCases TestCase Summary : Total ByPassed=" + MaxIndexByPassedTest + " ByPassed Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; y < MaxIndexByPassedTest; y++) {
//            System.out.print(ConsoleColors.RED + " " + ByPassed.get(y) + ConsoleColors.RESET);
//            if ((y != 0) && (y % 5 == 0)) {
//                System.out.print(System.lineSeparator());
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": MissedNumberTestCases TestCase Summary : Total MissedNumber=" + MaxIndexMissedNumberTest + " MissedNumber Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; (y < MaxIndexMissedNumberTest); y++) {
//            if (MissedNumber.get(y) != null) {
//                System.out.print(ConsoleColors.RED + " " + MissedNumber.get(y) + ", " + ConsoleColors.RESET);
//                if ((y != 0) && (y % 5 == 0)) {
//                    System.out.print(System.lineSeparator());
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
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
//        System.out.println(ConsoleColors.CYAN + AlgoDispStr + ": StaleAnswers TestCase Summary : Total StaleAnswerCount=" + StaleAnsTestCases.size() + " Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; (y <= StaleAnsTestCases.size()); y++) {
//            if ((StaleAnsTestCases.get(y) != null)) {
//                System.out.print(ConsoleColors.CYAN + " " + StaleAnsTestCases.get(y) + "," + ConsoleColors.RESET);
//                if ((y != 0) && (y % 10 == 0)) {
//                    System.out.print(System.lineSeparator());
//                }
//            }
//        }
//        System.out.print(System.lineSeparator()); 
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": FailedAnswers TestCase Summary : Total FailAnswerCount=" + FailAnsTestCases.size() + " Test Cases are:" + ConsoleColors.RESET);
//        for (int y = 0; (y <= FailAnsTestCases.size()); y++) {
//            if ((FailAnsTestCases.get(y) != null)) {
//                System.out.print(ConsoleColors.BLUE + " " + FailAnsTestCases.get(y) + "," + ConsoleColors.RESET);
//                if ((y != 0) && (y % 10 == 0)) {
//                    System.out.print(System.lineSeparator());
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println("Failed/Stale Answer Summary:");
//        System.out.println("Stale Answer Summary:");
//        for (int y1 = 0; (StaleAnsTestCases != null) && (y1 <= StaleAnsTestCases.size()); y1++) {
//            if ((y1 < StaleAnsTestCases.size()) && (StaleAnsTestCases.get(y1) != null)) {
//                if ((StaleAnsTestCases.get(y1).contains("Section")) && (StaleAnsTestCases.get(y1).contains("Complete # of Stale Ans="))) {
//                    System.out.print(ConsoleColors.BLUE + StaleAnsTestCases.get(y1) + ConsoleColors.RESET);
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println("Failed Answer Summary:");
//        for (int y1 = 0; (FailAnsTestCases != null) && (y1 <= FailAnsTestCases.size()); y1++) {
//            if ((y1 < FailAnsTestCases.size()) && (FailAnsTestCases.get(y1) != null)) {
//                if ((FailAnsTestCases.get(y1).contains("Section")) && (FailAnsTestCases.get(y1).contains("Complete # of Fail Ans="))) {
//                    System.out.print(ConsoleColors.BLUE + FailAnsTestCases.get(y1) + ConsoleColors.RESET);
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println("Flip Data Summary:");
//        for (int y1 = 0; (FlippedBothTestCases != null) && (y1 <= FlippedBothTestCases.size()); y1++) {
//            if ((y1 < FlippedBothTestCases.size()) && (FlippedBothTestCases.get(y1) != null)) {
//                if ((FlippedBothTestCases.get(y1).contains("Section")) && (FlippedBothTestCases.get(y1).contains("Complete # of Both Flips="))) {
//                    System.out.print(ConsoleColors.BLUE + FlippedBothTestCases.get(y1) + ConsoleColors.RESET);
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
//        System.out.println(ConsoleColors.BLUE + AlgoDispStr + ": Flipped Summary : " + " Failed Test Cases are:" + ConsoleColors.RESET);
//        for (int y2 = 0; (y2 <= FlippedBothTestCases.size()); y2++) {
//            if (FlippedBothTestCases.get(y2) != null) {
//                System.out.print(ConsoleColors.BLUE + " " + FlippedBothTestCases.get(y2) + ", " + ConsoleColors.RESET);
//                if ((y2 != 0) && (y2 % 5 == 0)) {
//                    System.out.print(System.lineSeparator());
//                }
//            }
//        }
//        System.out.print(System.lineSeparator());
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
        int blockNum = 1;
        System.out.println("Detailed Failed Summary:Block:blockNum=" + blockNum + " i=" + i);
        for (/*String str : sortedTestCases.keySet()*/Map.Entry<Integer, Boolean> entry : sortedTestCases.entrySet()) {
            String str = "" + entry.getKey();
            if ((!entry.getValue()) && (i >= 0) && (i < 100)) {
                if ((str != null) && (!str.equalsIgnoreCase("") )
                        //&& (EqnExpectedMap1DB.get(str) != null) && (!EqnExpectedMap1DB.get(str).equalsIgnoreCase("")) 
                        //&& (EqnExpectedCalcuDB.get(str) != null) && (!EqnExpectedCalcuDB.get(str).equalsIgnoreCase("")) && (EqnExpectedMap2DB.get(str) != null) && (!EqnExpectedMap2DB.get(str).equalsIgnoreCase(""))
                        ) {
                    if (EqnUnderTestDB.get(str)!=null){
                    System.out.println(ConsoleColors.RED + " TestCase=" + str + " EqnUnderTest  =" + EqnUnderTestDB.get(str) + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED + " TestCase=" + str + " Order  =" + OrderTestDB.get(str) + "       " + " DiffWithRespTo=" +  DiffWithRespToDB.get(str) + ConsoleColors.RESET);
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
                    }
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

    }
}
