package jp.ne.voqn.calcurator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static jp.ne.voqn.calcurator.Combinatorics.*;

/**
 *
 * @author VoQn
 */
public class CombinatoricsTest {

    public CombinatoricsTest() {
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
   * Test of permutation method, of class Calculator.
   */
  @Test
  public void testPermutation() {
    int[] n = {0, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4};
    int[] r = {0, 0, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 4};
    int[] exp = {1, 1, 1, 2, 2, 1, 3, 6, 6, 1, 4, 12, 24, 24};
    for (int i = 0, l = n.length; i < l; i++) {
      assertEquals(exp[i], permutation(n[i], r[i]));
    }
  }

  @Test
  public void testPermutationNegativeCase() {
    int[] n = {-1, 0, 1};
    int[] r = {0, -1, 2};
    for (int i = 0, l = n.length; i < l; i++) {
      try {
        long result = permutation(n[i], r[i]); // must throw Exception
        fail(Long.toString(result));
      } catch (IllegalArgumentException e) {
      }
    }
  }

  /**
   * Test of repeatedPermutation method, of class Calculator.
   */
  @Test
  public void testRepeatedPermutation() {
    int[] n = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3};
    int[] r = {0, 0, 1, 0, 1, 2, 0, 1, 2, 3};
    int[] exp = {1, 1, 1, 1, 2, 4, 1, 3, 9, 27};
    for (int i = 0, l = exp.length; i < l; i++) {
      assertEquals(exp[i], repeatedPermutation(n[i], r[i]));
    }
  }

  @Test
  public void testRepeatedPermutationErrorCase() {
    int[] n = {-1, 0, 1};
    int[] r = {0, -1, 2};
    for (int i = 0, l = n.length; i < l; i++) {
      try {
        long result = repeatedPermutation(n[i], r[i]);
        // must throw Exception
        fail(Long.toString(result));
      } catch (IllegalArgumentException e) {
      }
    }
  }

  /**
   * Test of combination method, of class Calculator.
   */
  @Test
  public void testCombination() {
    int[] n = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4};
    int[] r = {0, 0, 1, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 4};
    int[] exp = {1, 1, 1, 1, 2, 1, 1, 3, 3, 1, 1, 4, 6, 4, 1};
    for (int i = 0, l = n.length; i < l; i++) {
      assertEquals(exp[i], combination(n[i], r[i]));
    }
  }

  @Test
  public void testCombinationErrorCase() {
    int[] n = {-1, 0, 1};
    int[] r = {0, -1, 2};
    for (int i = 0, l = n.length; i < l; i++) {
      try {
        long result = combination(n[i], r[i]);
        // must throw Exception
        fail(Long.toString(result));
      } catch (IllegalArgumentException e) {
      }
    }
  }

}