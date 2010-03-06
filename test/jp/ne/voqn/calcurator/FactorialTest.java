package jp.ne.voqn.calcurator;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static jp.ne.voqn.calcurator.Factorial.*;

/**
 *
 * @author VoQn
 */
public class FactorialTest {

    public FactorialTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of checkNegativeIllegalArgument method, of class Factorial.
     */
    @Test
    public void testCheckNegativeIllegalArgumentThrough() {
        int n = 0;
        checkNegativeIllegalArgument(n);
    }

    /**
     * Test of checkNegativeIllegalArgument method, of class Factorial.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCheckNegativeIllegalArgument() {
        int n = -1;
        checkNegativeIllegalArgument(n);
        fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class Factorial
     */
    @Test
    public void testFactorial() {
        int[] n = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] exp = {1, 1, 2, 6, 24, 120, 720, 5040, 40320};
        for (int i = 0, l = n.length; i < l; i++) {
            assertEquals(exp[i], factorial(n[i]));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeCase() {
        int n = -1;
        long result = factorial(n); // must throw Exception
        fail(Long.toString(result));
    }

    @Test
    public void testFact() {
        int[] ns = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] exps = {1, 1, 2, 6, 24, 120, 720, 5040, 40320};
        for (int i = 0, l = ns.length; i < l; i++) {
            BigInteger exp = BigInteger.valueOf(exps[i]);
            assertEquals(exp, fact(ns[i]));
        }
    }

    @Test
    public void testApproximation() {
        int[] ns = {0, 1, 2, 20};
        for (int n : ns) {
            assertNear(factorial(n), approximation(n), 0.1);
        }
    }

    private static void assertNear(long exp, double out, double acp) {
        double diff = Math.abs(exp - out);
        double percent = diff / Math.max(exp, out);
        assertTrue(percent < acp);
    }

    @Test
    public void testApprox() {
        int[] ns = {0, 1, 2, 10, 20, 30, 100};
        for (int n : ns) {
            assertNear(fact(n), approx(n), 0.01);
        }
    }

    private static void assertNear(BigInteger exp, BigDecimal out, double acp) {
        BigInteger lt, gt;
        lt = exp.min(out.toBigInteger());
        gt = exp.max(out.toBigInteger());
        double rate = lt.divide(gt).doubleValue();
        assertTrue(rate - 1 < acp);
    }
}
