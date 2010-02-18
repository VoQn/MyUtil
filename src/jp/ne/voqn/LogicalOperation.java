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

  public static boolean and(boolean... bools) {
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
    boolean result = false;
    if (bools != null) {
      for (boolean bool : bools) {
        result = result || bool;
      }
    }
    return result;
  }

  public static boolean nand(boolean... bools) {
    return !and(bools);
  }

  public static boolean xor(boolean... bools) {
    return or(bools) && nand(bools);
  }

  public static boolean imp(boolean p, boolean q) {
    return !(p && !q);
  }

  public static boolean eq(boolean... bools) {
    return !xor(bools);
  }
}
