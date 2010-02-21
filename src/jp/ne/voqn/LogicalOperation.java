/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.ne.voqn;

/**
 *
 * @author VoQn
 */
public class LogicalOperation {

  private static final String LESS_THAN_TWO_ARGUMENT_ERROR_MESSAGE;

  static {
    LESS_THAN_TWO_ARGUMENT_ERROR_MESSAGE = "method need more than 2 boolean argument";
  }

  public static boolean and(boolean... bools) {
    if (bools == null || bools.length < 2) {
      String message = "and " + LESS_THAN_TWO_ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
    boolean result = true;
    if (bools == null) {
      result = false;
    } else {
      for (boolean bool : bools) {
        result = result && bool;
      }
    }
    return result;
  }

  public static boolean or(boolean... bools) {
    if (bools == null || bools.length < 2) {
      String message = "or " + LESS_THAN_TWO_ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
    boolean result = false;
    for (boolean bool : bools) {
      result = result || bool;
    }
    return result;
  }

  public static boolean nand(boolean... bools) {
    if (bools == null || bools.length < 2) {
      String message = "nand " + LESS_THAN_TWO_ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
    return !and(bools);
  }

  public static boolean xor(boolean... bools) {
    if (bools == null || bools.length < 2) {
      String message = "xor " + LESS_THAN_TWO_ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
    return or(bools) && nand(bools);
  }

  public static boolean imp(boolean p, boolean q) {
    return !(p && !q);
  }

  public static boolean eq(boolean... bools) {
    if (bools == null || bools.length < 2) {
      String message = "eq " + LESS_THAN_TWO_ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
    return !xor(bools);
  }
}
