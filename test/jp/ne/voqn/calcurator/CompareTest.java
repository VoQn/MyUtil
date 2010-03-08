package jp.ne.voqn.calcurator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static jp.ne.voqn.calcurator.Compare.*;

/**
 *
 * @author VoQn
 */
public class CompareTest {

    public CompareTest() {
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

    private Number[][] getErrorArrayCases() {
        return new Number[][]{
                    null,
                    {},};
    }

    /**
     * Test of max method, of class Calculator.
     */
    @Test
    public void testMax() {
        double expResult = 2;
        double result = max(-2, -1, 0, 1, 2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMaxErrorCase() {
        for (Number[] errorCase : getErrorArrayCases()) {
            try {
                double result = max(errorCase); // must throw Exception
                fail(Double.toString(result));
            } catch (IllegalArgumentException e) {
            }
        }
    }

    /**
     * Test of min method, of class Calculator.
     */
    @Test
    public void testMin() {
        double expResult = -2;
        double result = min(-2, -1, 0, 1, 2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMinErrorCase() {
        for (Number[] errorCase : getErrorArrayCases()) {
            try {
                double result = min(errorCase); // must throw Exception
                fail(Double.toString(result));
            } catch (IllegalArgumentException e) {
            }
        }
    }
}