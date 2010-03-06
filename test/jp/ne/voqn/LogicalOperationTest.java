package jp.ne.voqn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static jp.ne.voqn.LogicalOperation.*;

/**
 *
 * @author VoQn
 */
public class LogicalOperationTest {

    public LogicalOperationTest() {
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

    private boolean[][] getErrorCase() {
        return new boolean[][]{
                    null,
                    {},
                    {true},
                    {false}
                };
    }

    private boolean[][] getTestCases() {
        return new boolean[][]{
                    {true, true},
                    {true, false},
                    {false, true},
                    {false, false},
                    {true, true, true},
                    {true, false, true},
                    {false, true, false},
                    {false, false, false}
                };
    }

    private boolean[] getExpAndResult() {
        return new boolean[]{
                    true, false, false, false,
                    true, false, false, false
                };
    }

    private boolean[] getExpOrResult() {
        return new boolean[]{
                    true, true, true, false,
                    true, true, true, false
                };
    }

    private boolean[] getExpNandResult() {
        return new boolean[]{
                    false, true, true, true,
                    false, true, true, true
                };
    }

    private boolean[] getExpXorResult() {
        return new boolean[]{
                    false, true, true, false,
                    false, false, true, false
                };
    }

    private boolean[] getExpEqResult() {
        return new boolean[]{
                    true, false, false, true,
                    true, false, false, true
                };
    }

    /**
     * Test of and method, of class LogicalOperation.
     */
    @Test
    public void testAnd() {
        boolean[][] testCase = getTestCases();
        boolean[] expResults = getExpAndResult();

        for (int i = 0; i < testCase.length; i++) {
            boolean result = and(testCase[i]);
            boolean expResult = expResults[i];
            assertEquals(expResult, result);
        }
    }

    @Test
    public void testANDErrorCase() {
        for (boolean[] errorCase : getErrorCase()) {
            try {
                boolean result = and(errorCase); // must throw Exception
                fail(Boolean.toString(result));
            } catch (IllegalArgumentException e) {
            }
        }
    }

    /**
     * Test of or method, of class LogicalOperation.
     */
    @Test
    public void testOr() {
        boolean[][] testCase = getTestCases();
        boolean[] expResults = getExpOrResult();

        for (int i = 0; i < testCase.length; i++) {
            boolean result = or(testCase[i]);
            boolean expResult = expResults[i];
            assertEquals(expResult, result);
        }
    }

    @Test
    public void testORErrorCase() {
        for (boolean[] errorCase : getErrorCase()) {
            try {
                boolean result = or(errorCase); // must throw Exception
                fail(Boolean.toString(result));
            } catch (IllegalArgumentException e) {
            }
        }
    }

    /**
     * Test of nand method, of class LogicalOperation.
     */
    @Test
    public void testNand() {
        boolean[][] testCase = getTestCases();
        boolean[] expResults = getExpNandResult();

        for (int i = 0; i < testCase.length; i++) {
            boolean result = nand(testCase[i]);
            boolean expResult = expResults[i];
            assertEquals(expResult, result);
        }
    }

    @Test
    public void testNANDErrorCase() {
        for (boolean[] errorCase : getErrorCase()) {
            try {
                boolean result = nand(errorCase); // must throw Exception
                fail(Boolean.toString(result));
            } catch (IllegalArgumentException e) {
            }
        }
    }

    /**
     * Test of xor method, of class LogicalOperation.
     */
    @Test
    public void testXor() {
        boolean[][] testCase = getTestCases();
        boolean[] expResults = getExpXorResult();

        for (int i = 0; i < testCase.length; i++) {
            boolean result = LogicalOperation.xor(testCase[i]);
            boolean expResult = expResults[i];
            assertEquals(expResult, result);
        }
    }

    @Test
    public void testXORErrorCase() {
        for (boolean[] errorCase : getErrorCase()) {
            try {
                boolean result = LogicalOperation.xor(errorCase); // must throw Exception
                fail(Boolean.toString(result));
            } catch (IllegalArgumentException e) {
            }
        }
    }

    /**
     * Test of imp method, of class LogicalOperation.
     */
    @Test
    public void testImp() {
        boolean[][] testCase = {
            {true, true},
            {true, false},
            {false, true},
            {false, false}
        };

        boolean[] expResults = {
            true,
            false,
            true,
            true
        };

        for (int i = 0; i < testCase.length; i++) {
            boolean[] test = testCase[i];
            boolean p = test[0];
            boolean q = test[1];
            boolean expResult = expResults[i];
            boolean result = LogicalOperation.imp(p, q);
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of eq method, of class LogicalOperation.
     */
    @Test
    public void testEq() {
        boolean[][] testCase = getTestCases();
        boolean[] expResults = getExpEqResult();

        for (int i = 0; i < testCase.length; i++) {
            boolean result = LogicalOperation.eq(testCase[i]);
            boolean expResult = expResults[i];
            assertEquals(expResult, result);
        }
    }

    @Test
    public void testEQErrorCase() {
        for (boolean[] errorCase : getErrorCase()) {
            try {
                boolean result = LogicalOperation.eq(errorCase); // must throw Exception
                fail(Boolean.toString(result));
            } catch (IllegalArgumentException e) {
            }
        }
    }
}
