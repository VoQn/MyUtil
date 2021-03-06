package jp.ne.voqn.calcurator;

import static jp.ne.voqn.calcurator.Range.of;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VoQn
 */
public class RangeTest {

    public RangeTest() {
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
     * Test of iterator method, of class Range.
     */
    @Test
    public void testOneArgs() {
        testOneArgument( 5, new int[]{0,  1,  2,  3,  4});
        testOneArgument(-5, new int[]{0, -1, -2, -3, -4});
        testOneArgument( 0, new int[]{});
    }

    private void testOneArgument(int target, int[] expValues) {
        int i = 0;
        for (int v : of(target)) {
            assertEquals(expValues[i++], v);
        }
        assertEquals(i, expValues.length);
    }

    @Test
    public void testTwoArgs() {
        testTwoArguments(-2,  3, new int[]{-2, -1,  0,  1,  2});
        testTwoArguments( 2, -3, new int[]{ 2,  1,  0, -1, -2});
        testTwoArguments( 0,  0, new int[]{});
    }

    private void testTwoArguments(int start, int stop, int[] expValues) {
        int i = 0;
        for (int v : of(start, stop)) {
            assertEquals(expValues[i++], v);
        }
        assertEquals(i, expValues.length);
    }
}
