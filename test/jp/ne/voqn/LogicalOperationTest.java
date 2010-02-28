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

    for (int i = 0; i < testCase.length; i++) {
      result = LogicalOperation.and(testCase[i]);
      boolean expResult = expResults[i];
      assertEquals(expResult, result);
    }
  }

  /**
   * Test of or method, of class LogicalOperation.
   */
  @Test
  public void testOr() {
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
      {},
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
      false,
      true,
      true,
      true,
      false
    };

    for (int i = 0; i < testCase.length; i++) {
      result = LogicalOperation.or(testCase[i]);
      boolean expResult = expResults[i];
      assertEquals(expResult, result);
    }
  }

  /**
   * Test of nand method, of class LogicalOperation.
   */
  @Test
  public void testNand() {
    boolean[] nullCase = null;
    boolean result;
    boolean errorCatch;
    try {
      result = LogicalOperation.nand(nullCase);
      errorCatch = false;
    } catch (IllegalArgumentException e) {
      errorCatch = true;
    }
    assertTrue(errorCatch);

    boolean[][] testCase = {
      {},
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
      true,
      false,
      true,
      true,
      true
    };

    for (int i = 0; i < testCase.length; i++) {
      result = LogicalOperation.nand(testCase[i]);
      boolean expResult = expResults[i];
      assertEquals(expResult, result);
    }
  }

  /**
   * Test of xor method, of class LogicalOperation.
   */
  @Test
  public void testXor() {
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
      {},
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
      false,
      true,
      true,
      false
    };

    for (int i = 0; i < testCase.length; i++) {
      result = LogicalOperation.xor(testCase[i]);
      boolean expResult = expResults[i];
      assertEquals(expResult, result);
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
      {},
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
      true,
      false,
      false,
      true
    };

    for (int i = 0; i < testCase.length; i++) {
      result = LogicalOperation.eq(testCase[i]);
      boolean expResult = expResults[i];
      assertEquals(expResult, result);
    }
  }
}
