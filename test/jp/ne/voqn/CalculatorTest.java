package jp.ne.voqn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static jp.ne.voqn.Calculator.*;

/**
 *
 * @author VoQn
 */
public class CalculatorTest {

  public CalculatorTest() {
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

  private double[][] getErrorArrayCases() {
    return new double[][]{
              null,
              {},};
  }

  /**
   * Test of sum method, of class Calculator.
   */
  @Test
  public void testSumNormal() {
    double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    double expResult = 55;
    double result = sum(numbers);
    assertEquals(expResult, result, 0);
  }

  /**
   * Test of sum method, case of argument was null.
   */
  @Test
  public void testSumErrorCase() {
    for (double[] errorCase : getErrorArrayCases()) {
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
    double[] numbers = {2, 2, 2, 2, 2};
    double expResult = Math.pow(2, 5);
    double result = product(numbers);
    assertEquals(expResult, result, 0);
  }

  @Test
  public void testProductErrorCase() {
    for (double[] errorCase : getErrorArrayCases()) {
      try {
        double result = product(errorCase); // must throw Exception
        fail(Double.toString(result));
      } catch (IllegalArgumentException e) {
      }
    }
  }

  /**
   * Test of max method, of class Calculator.
   */
  @Test
  public void testMax() {
    double[] numbers = {-2, -1, 0, 1, 2};
    double expResult = 2;
    double result = max(numbers);
    assertEquals(expResult, result, 0);
  }

  @Test
  public void testMaxErrorCase() {
    for (double[] errorCase : getErrorArrayCases()) {
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
    double[] numbers = {-2, -1, 0, 1, 2};
    double expResult = -2;
    double result = min(numbers);
    assertEquals(expResult, result, 0);
  }

  @Test
  public void testMinErrorCase() {
    for (double[] errorCase : getErrorArrayCases()) {
      try {
        double result = Calculator.min(errorCase); // must throw Exception
        fail(Double.toString(result));
      } catch (IllegalArgumentException e) {
      }
    }
  }
}
