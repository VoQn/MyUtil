/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.ne.voqn.calcurator;

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
}
