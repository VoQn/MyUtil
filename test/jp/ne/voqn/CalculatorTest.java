/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
  public void testSum() {
    System.out.println("sum");

    Number[] numbers = {1,2,3,4,5,6,7,8,9,10};
    Number expResult = 55.0;
    Number result = Calculator.sum(numbers);
    assertEquals(expResult, result);

    numbers = null;
    expResult = 0.0;
    result = Calculator.sum(numbers);
    assertEquals(expResult, result);
  }

  /**
   * Test of product method, of class Calculator.
   */
  @Test
  public void testProduct() {
    System.out.println("product");

    Number[] numbers = {2,2,2,2,2};
    Number expResult = Math.pow(2, 5);
    Number result = Calculator.product(numbers);
    assertEquals(expResult, result);

    numbers = null;
    expResult = 0.0;
    result = Calculator.product(numbers);
    assertEquals(expResult, result);
  }

  /**
   * Test of max method, of class Calculator.
   */
  @Test
  public void testMax() {
    System.out.println("max");
    Number[] numbers = {-1,0,1};
    Number expResult = 1.0;
    Number result = Calculator.max(numbers);
    assertEquals(expResult, result);
    numbers = null;
    expResult = null;
    result = null;
    assertEquals(expResult, result);
  }

  /**
   * Test of min method, of class Calculator.
   */
  @Test
  public void testMin() {
    System.out.println("min");
    Number[] numbers = {-1,0,1};
    Number expResult = -1.0;
    assertEquals(expResult, Calculator.min(numbers));

    numbers = null;
    expResult = null;
    assertEquals(expResult, Calculator.min(numbers));
  }

  /**
   * Test of factorial method, of class Calculator.
   */
  @Test
  public void testFactorial() {
    System.out.println("factorial");
    int n = 0;
    int expResult = 1;
    int result = Calculator.factorial(n);
    assertEquals(expResult, result);

    n = -1;
    boolean errorCatched;
    try {
      result = Calculator.factorial(n);
      errorCatched = false;
    } catch (IllegalArgumentException e) {
      errorCatched = true;
    }
    assertTrue(errorCatched);
  }

  /**
   * Test of permutation method, of class Calculator.
   */
  @Test
  public void testPermutation() {
    System.out.println("permutation");
    int n = 0;
    int r = 0;
    int expResult = 1;
    int result = Calculator.permutation(n, r);
    assertEquals(expResult, result);
    
    n = 1;
    r = 2;
    boolean erroeCatched;
    try{
      result = Calculator.repeatedPermutation(n, r);
      erroeCatched = false;
    }catch(IllegalArgumentException e){
      erroeCatched = true;
      System.out.println(e.getStackTrace());
    }
    assertTrue(erroeCatched);
  }

  /**
   * Test of repeatedPermutation method, of class Calculator.
   */
  @Test
  public void testRepeatedPermutation() {
    System.out.println("repeatedPermutation");
    int n = 0;
    int r = 0;
    int expResult = 1;
    int result = Calculator.repeatedPermutation(n, r);
    assertEquals(expResult, result);
   
    n = 1;
    r = 2;
    boolean erroeCatched;
    try{
      result = Calculator.repeatedPermutation(n, r);
      erroeCatched = false;
    }catch(IllegalArgumentException e){
      erroeCatched = true;
      System.out.println(e.getStackTrace());
    }
    assertTrue(erroeCatched);
  }

  /**
   * Test of combination method, of class Calculator.
   */
  @Test
  public void testCombination() {
    System.out.println("combination");
    int n = 0;
    int r = 0;
    int expResult = 1;
    int result = Calculator.combination(n, r);
    assertEquals(expResult, result);

    n = 1;
    r = 2;
    boolean erroeCatched;
    try{
      result = Calculator.combination(n, r);
      erroeCatched = false;
    }catch(IllegalArgumentException e){
      erroeCatched = true;
      System.out.println(e.getStackTrace());
    }
    assertTrue(erroeCatched);
  }

}