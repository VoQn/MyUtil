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

  /**
   * Test of and method, of class LogicalOperation.
   */
  @Test
  public void testAnd() {
    System.out.println("and");
    boolean[] nullCase = null;
    boolean result;
    boolean errorCatch;
    try {
      result = LogicalOperation.and(nullCase);
      errorCatch = false;
    } catch (IllegalArgumentException e) {
      errorCatch = true;
    }
    assertTrue(errorCatch);

    boolean[][] testCase = {
      {true},
      {false},
      {true, true},
      {true, false},
      {false, true},
      {false, false}
    };

    boolean[] expResults = {
      true,
      false,
      true,
      false,
      false,
      false
    };

    boolean isLessThan2Arguments;
    for (int i = 0; i < expResults.length; i++) {
      isLessThan2Arguments = testCase[i].length < 2;
      try {
        result = LogicalOperation.and(testCase[i]);
        boolean expResult = expResults[i];
        assertEquals(expResult, result);
        assertFalse(isLessThan2Arguments);
      } catch (IllegalArgumentException e) {
        assertTrue(isLessThan2Arguments);
      }
    }
  }

  /**
   * Test of or method, of class LogicalOperation.
   */
  @Test
  public void testOr() {
    System.out.println("or");
    boolean[] nullCase = null;
    boolean errorCatch;
    boolean result;
    try {
      result = LogicalOperation.or(nullCase);
      errorCatch = false;
    } catch (IllegalArgumentException e) {
      errorCatch = true;
    }
    assertTrue(errorCatch);

    boolean[][] testCase = {
      {true},
      {false},
      {true, true},
      {true, false},
      {false, true},
      {false, false}
    };

    boolean[] expResults = {
      true,
      false,
      true,
      true,
      true,
      false
    };

    boolean isLessThan2Arguments;
    for (int i = 0; i < expResults.length; i++) {
      isLessThan2Arguments = testCase[i].length < 2;
      try {
        result = LogicalOperation.or(testCase[i]);
        assertEquals(expResults[i], result);
        assertFalse(isLessThan2Arguments);
      } catch (IllegalArgumentException e) {
        assertTrue(isLessThan2Arguments);
      }
    }
  }

  /**
   * Test of nand method, of class LogicalOperation.
   */
  @Test
  public void testNand() {
    System.out.println("nand");
    boolean[] nullCase = null;
    boolean errorCatch;
    try {
      boolean result = LogicalOperation.nand(nullCase);
      errorCatch = false;
    } catch (IllegalArgumentException e) {
      errorCatch = true;
    }
    assertTrue(errorCatch);

    boolean[][] testCase = {
      {true},
      {false},
      {true, true},
      {true, false},
      {false, true},
      {false, false}
    };

    boolean[] expResults = {
      false,
      true,
      false,
      true,
      true,
      true
    };

    boolean isLessThan2Argument;
    for (int i = 0; i < expResults.length; i++) {
      isLessThan2Argument = testCase[i].length < 2;
      try {
        boolean result = LogicalOperation.nand(testCase[i]);
        assertEquals(expResults[i], result);
        assertFalse(isLessThan2Argument);
      } catch (IllegalArgumentException e) {
        assertTrue(isLessThan2Argument);
      }
    }
  }

  /**
   * Test of xor method, of class LogicalOperation.
   */
  @Test
  public void testXor() {
    System.out.println("xor");
    boolean[] nullCase = null;
    boolean errorCatch;
    boolean result;
    try {
      result = LogicalOperation.xor(nullCase);
      errorCatch = false;
    } catch (IllegalArgumentException e) {
      errorCatch = true;
    }
    assertTrue(errorCatch);

    boolean[][] testCase = {
      {true},
      {false},
      {true, true},
      {true, false},
      {false, true},
      {false, false}
    };

    boolean[] expResults = {
      false,
      false,
      false,
      true,
      true,
      false
    };

    boolean isLessThan2Argument;
    for (int i = 0; i < expResults.length; i++) {
      isLessThan2Argument = testCase[i].length < 2;
      try {
        result = LogicalOperation.xor(testCase[i]);
        assertEquals(expResults[i], result);
        assertFalse(isLessThan2Argument);
      } catch (IllegalArgumentException e) {
        assertTrue(isLessThan2Argument);
      }
    }
  }

  /**
   * Test of imp method, of class LogicalOperation.
   */
  @Test
  public void testImp() {
    System.out.println("imp");
    boolean[][] testCase = {
      {true, true, true},
      {true, false, false},
      {false, true, true},
      {false, false, true}
    };
    for (boolean[] test : testCase) {
      boolean p = test[0];
      boolean q = test[1];
      boolean expResult = test[2];
      boolean result = LogicalOperation.imp(p, q);
      assertEquals(expResult, result);
    }
  }

  /**
   * Test of eq method, of class LogicalOperation.
   */
  @Test
  public void testEq() {
    System.out.println("eq");
    boolean[] nullCase = null;
    boolean errorCatch;
    boolean result;
    try {
      result = LogicalOperation.eq(nullCase);
      errorCatch = false;
    } catch (IllegalArgumentException e) {
      errorCatch = true;
    }
    assertTrue(errorCatch);

    boolean[][] testCase = {
      {true},
      {false},
      {true, true},
      {true, false},
      {false, true},
      {false, false}
    };

    boolean[] expResults = {
      true,
      true,
      true,
      false,
      false,
      true
    };

    boolean isLessThan2Argument;
    for (int i = 0; i < expResults.length; i++) {
      isLessThan2Argument = testCase[i].length < 2;
      try {
        result = LogicalOperation.eq(testCase[i]);
        assertEquals(expResults[i], result);
        assertFalse(isLessThan2Argument);
      } catch (IllegalArgumentException e) {
        assertTrue(isLessThan2Argument);
      }
    }
  }
}
