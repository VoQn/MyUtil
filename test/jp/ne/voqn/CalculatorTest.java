package jp.ne.voqn;

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

  /**
   * Test of sum method, of class Calculator.
   */
  @Test
  public void testSumNormal() {
    double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    double expResult = 55.0;
    double result = Calculator.sum(numbers);
    assertEquals(expResult, result, 0);
  }

  /**
   * Test of sum method, case of argument was null.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testSumNullCase() {
    double[] numbers = null;
    double result = Calculator.sum(numbers); // must throw Exception
    fail(Double.toString(result));
  }

  /**
   * Test of sum method, case of arguments was empty array
   */
  @Test(expected = IllegalArgumentException.class)
  public void testSumEmptyCase() {
    double[] numbers = {};
    double result = Calculator.sum(numbers); // must throw Exception
    fail(Double.toString(result));
  }

  /**
   * Test of product method, of class Calculator.
   */
  @Test
  public void testProduct() {
    double[] numbers = {2, 2, 2, 2, 2};
    double expResult = Math.pow(2, 5);
    double result = Calculator.product(numbers);
    assertEquals(expResult, result, 0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testProductNullCase() {
    double[] numbers = null;
    double result = Calculator.product(numbers); // must throw Exception
    fail(Double.toString(result));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testProductEmptyCase() {
    double[] numbers = {};
    double result = Calculator.product(numbers); // must throw Exception
    fail(Double.toString(result));
  }

  /**
   * Test of max method, of class Calculator.
   */
  @Test
  public void testMax() {
    double[] numbers = {-1, 0, 1};
    double expResult = 1.0;
    double result = Calculator.max(numbers);
    assertEquals(expResult, result, 0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testMaxNullCase() {
    double[] numbers = null;
    double result = Calculator.max(numbers); // must throw Exception
    fail(Double.toString(result));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testMaxEmptyCase() {
    double[] numbers = {};
    double result = Calculator.max(numbers); // must throw Exception
    fail(Double.toString(result));
  }

  /**
   * Test of min method, of class Calculator.
   */
  @Test
  public void testMin() {
    double[] numbers = {-1, 0, 1};
    double expResult = -1.0;
    double result = Calculator.min(numbers);
    assertEquals(expResult, result, 0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testMinNullCase() {
    double[] numbers = null;
    double result = Calculator.min(numbers); // must throw Exception
    fail(Double.toString(result));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testMinEmptyCase() {
    double[] numbers = {};
    double result = Calculator.min(numbers); // must throw Exception
    fail(Double.toString(result));
  }

  /**
   * Test of factorial method, of class Calculator.
   */
  @Test
  public void testFactorial() {
    int n = 0;
    int expResult = 1;
    int result = Calculator.factorial(n);
    assertEquals(expResult, result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFactorialNegativeCase() {
    int n = -1;
    int result = Calculator.factorial(n); // must throw Exception
    fail(Integer.toString(result));
  }

  /**
   * Test of permutation method, of class Calculator.
   */
  @Test
  public void testPermutation() {
    int n = 0;
    int r = 0;
    int expResult = 1;
    int result = Calculator.permutation(n, r);
    assertEquals(expResult, result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testPermutationNegativeCase() {
    int n = -1;
    int r = 0;
    int result = Calculator.permutation(n, r); // must throw Exception
    fail(Integer.toString(result));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testPermutationOverRangeCase() {
    int n = 1;
    int r = 2;
    int result = Calculator.permutation(n, r); // must throw Exception
    fail(Integer.toString(result));
  }

  /**
   * Test of repeatedPermutation method, of class Calculator.
   */
  @Test
  public void testRepeatedPermutation() {
    int n = 0;
    int r = 0;
    int expResult = 1;
    int result = Calculator.repeatedPermutation(n, r);
    assertEquals(expResult, result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testRepeatedPermutationNegativeCase() {
    int n = -1;
    int r = 0;
    int result = Calculator.repeatedPermutation(n, r); // must throw Exception
    fail(Integer.toString(result));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testRepeatedPermutationOverRangeCase() {
    int n = 1;
    int r = 2;
    int result = Calculator.repeatedPermutation(n, r); // must throw Exception
    fail(Integer.toString(result));
  }

  /**
   * Test of combination method, of class Calculator.
   */
  @Test
  public void testCombination() {
    int n = 0;
    int r = 0;
    int expResult = 1;
    int result = Calculator.combination(n, r);
    assertEquals(expResult, result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCombinationNegativeCase() {
    int n = -1;
    int r = 0;
    int result = Calculator.combination(n, r); // must throw Exception
    fail(Integer.toString(result));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCombinationOverRangeCase() {
    int n = 1;
    int r = 2;
    int result = Calculator.combination(n, r); // must throw Exception
    fail(Integer.toString(result));
  }
}
