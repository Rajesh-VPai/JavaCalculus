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

/**
 *
 * @author Rajesh V Pai
 */
public class TestHarness {
    // Add representative expressions here (include ones you've seen fail)
    static final String[] SAMPLE_EXPRESSIONS = new String[] {
        "-p*2.0/xyc1^3.0",
        "p*1/xyc1^2.0/xyc1^0 + p*1/xyc1/xyc1^0 + p*1/xyc1^2.0 + p*1/xyc1 + p*50.0*1.0",
        "p/-1.0/xyc1^1.0 + p*ln(xyc1) + p/-1.0/xyc1^1.0 + p*ln(xyc1) + p*50.0*xyc1",
        "-p/xyc1 + p*ln(xyc1) - p/xyc1 + p*ln(xyc1) + p*50.0*xyc1",
        "x^+3.0 * a / b^2.0",
        "a*xyc1^-2.0 + b*xyc1^+2.0",
        "-p*2.0/xyc1^3.0-p/xyc1^2.0-p*2.0/xyc1^3.0-p/xyc1^2.0+p*0.0"
    };

    public static void main(String[] args) {
        System.out.println("Round-trip and idempotence checks for FlipNormalizer\n");
        int idx = 0;
        for (String expr : SAMPLE_EXPRESSIONS) {
            idx++;
            System.out.println("=== CASE " + idx + " ===");
            System.out.println("Original: " + expr);

            String mult = FlipNormalizer.toMultiplicationForm(expr);
            System.out.println("ToMult: " + mult);

            String backDiv = FlipNormalizer.toDivisionForm(mult);
            System.out.println("Mult->Div: " + backDiv);
            System.out.println("Div eq orig? " + backDiv.equals(normalizeWhitespace(expr)));

            String div = FlipNormalizer.toDivisionForm(expr);
            System.out.println("ToDiv: " + div);

            String backMult = FlipNormalizer.toMultiplicationForm(div);
            System.out.println("Div->Mult: " + backMult);
            System.out.println("Mult eq orig? " + backMult.equals(normalizeWhitespace(expr)));

            // Idempotence
            String mult2 = FlipNormalizer.toMultiplicationForm(mult);
            System.out.println("Mult idempotent? " + mult2.equals(mult));
            String div2 = FlipNormalizer.toDivisionForm(div);
            System.out.println("Div idempotent? " + div2.equals(div));

            System.out.println();
        }
        System.out.println("Finished checks.");
    }

    // small helper: make whitespace canonical so trivial spacing doesn't break equality
    private static String normalizeWhitespace(String s) {
        if (s == null) return null;
        return s.replaceAll("\\s+", "");
    }

//public class FlipNormalizerTest {
//
//    @Test
//    public void testExponentFlipSimple() {
//        String in = "-p*2.0/xyc1^3.0";
//        String expectedMult = "-p*2.0*xyc1^-3.0";
//        String mult = FlipUtils.FlipNormalizer.toMultiplicationForm(in);
//        assertEquals(expectedMult, mult);
//        // round-trip
//        String round = FlipUtils.FlipNormalizer.toDivisionForm(mult);
//        assertEquals(in.replaceAll("\\s+",""), round);
//    }
//
//    @Test
//    public void testExponentWithPlusSign() {
//        String in = "x^+3.0";
//        String expectedFlip = "x^-3.0";
//        String mult = FlipUtils.FlipNormalizer.toMultiplicationForm("1/" + in);
//        assertTrue(mult.contains("x^-3.0"), "expected negative exponent after flip");
//    }
//
//    @Test
//    public void testNegativeExponentBackToDivision() {
//        String inMult = "p*xyc1^-2.0";
//        String expectedDiv = "p/xyc1^2.0";
//        String div = FlipUtils.FlipNormalizer.toDivisionForm(inMult);
//        assertTrue(div.contains("xyc1^2.0"), "expected positive exponent in division form");
//    }
//
//    @Test
//    public void testZeroCollapse() {
//        String in = "a*0.0*b";
//        String mult = FlipUtils.FlipNormalizer.toMultiplicationForm(in);
//        assertTrue(mult.equals("0.0") || mult.contains("0.0"), "Term with zero should collapse to 0.0");
//    }
//
//    @Test
//    public void testNestedParenthesis() {
//        String in = "p*(1/xyc1^2.0)";
//        String mult = FlipUtils.FlipNormalizer.toMultiplicationForm(in);
//        assertTrue(mult.contains("xyc1^-2.0") || mult.contains("1/xyc1^2.0"));
//    }
//
//    @Test
//    public void testIdempotenceMultiplication() {
//        String in = "p*xyc1^-2.0 + q*xyc1^-3.0";
//        String first = FlipUtils.FlipNormalizer.toMultiplicationForm(in);
//        String second = FlipUtils.FlipNormalizer.toMultiplicationForm(first);
//        assertEquals(first, second);
//    }
//
//    @Test
//    public void testIdempotenceDivision() {
//        String in = "p/xyc1^2.0 + q/xyc1^3.0";
//        String first = FlipUtils.FlipNormalizer.toDivisionForm(in);
//        String second = FlipUtils.FlipNormalizer.toDivisionForm(first);
//        assertEquals(first, second);
//    }
//
//    @Test
//    public void testRoundTripSeveral() {
//        String[] cases = new String[] {
//            "-p*2.0/xyc1^3.0",
//            "p/xyc1^2.0+p/xyc1+p*50.0",
//            "-p/xyc1+p*ln(xyc1)-p/xyc1"
//        };
//        for (String s : cases) {
//            String m = FlipUtils.FlipNormalizer.toMultiplicationForm(s);
//            String back = FlipUtils.FlipNormalizer.toDivisionForm(m);
//            assertEquals(s.replaceAll("\\s+",""), back, "round-trip failed for: " + s);
//        }
//    }
//}


    // ------------------------ small comparers / utilities for harness ------------------------

    public static class FlipResult {
        public final boolean map1Ok;
        public final boolean diffOk;
        public final boolean map2Ok;
        public FlipResult(boolean m1, boolean d, boolean m2) { this.map1Ok = m1; this.diffOk = d; this.map2Ok = m2; }
    }

    public static FlipResult compareMultiplication(String StrMap1, String StrDiff, String StrMap2,
                                                   String Answer2, String Answer3, String Answer4) {
        String canA2 = FlipNormalizer.toMultiplicationForm(Answer2);
        String canA3 = FlipNormalizer.toMultiplicationForm(Answer3);
        String canA4 = FlipNormalizer.toMultiplicationForm(Answer4);
        return new FlipResult(StrMap1.equals(canA2), StrDiff.equals(canA3), StrMap2.equals(canA4));
    }

    public static FlipResult compareDivision(String StrMap1, String StrDiff, String StrMap2,
                                             String Answer2, String Answer3, String Answer4) {
        String canA2 = FlipNormalizer.toDivisionForm(Answer2);
        String canA3 = FlipNormalizer.toDivisionForm(Answer3);
        String canA4 = FlipNormalizer.toDivisionForm(Answer4);
        return new FlipResult(StrMap1.equals(canA2), StrDiff.equals(canA3), StrMap2.equals(canA4));
    }

    // convenience round-trip test for harness
    public static boolean roundTripCheck(String raw) {
        String mult = FlipNormalizer.toMultiplicationForm(raw);
        String backDiv = FlipNormalizer.toDivisionForm(mult);
        String div = FlipNormalizer.toDivisionForm(raw);
        String backMult = FlipNormalizer.toMultiplicationForm(div);
        return div.equals(backDiv) && mult.equals(backMult);
    }

}
