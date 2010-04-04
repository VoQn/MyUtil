package jp.ne.voqn.calcurator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static jp.ne.voqn.calcurator.Combiner.*;

/**
 *
 * @author VoQn
 */
public class CombinerTest {

    public CombinerTest() {
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
     * Test of sum method, of class Calculator.
     */
    @Test
    public void testSum() {
        double expResult = 55;
        double result = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of sum method, case of argument was null.
     */
    @Test
    public void testSumErrorCase() {
        for (Number[] errorCase : getErrorArrayCases()) {
            try {
                double result = sum(errorCase); // must throw Exception
                fail(Double.toString(result));
            } catch (IllegalArgumentException e) {
            }
        }
    }

    /**
     * Test of product method, of class Calculator.
     */
    @Test
    public void testProduct() {
        double expResult = Math.pow(2, 5);
        double result = product(2, 2, 2, 2, 2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testProductErrorCase() {
        for (Number[] errorCase : getErrorArrayCases()) {
            try {
                double result = product(errorCase); // must throw Exception
                fail(Double.toString(result));
            } catch (IllegalArgumentException e) {
            }
        }
    }
}
