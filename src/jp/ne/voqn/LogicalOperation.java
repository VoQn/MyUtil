package jp.ne.voqn;

/**
 * basic logical operation class
 * @author VoQn
 */
public class LogicalOperation {

  /**
   * string message when throw IllegalArgumentsException
   */
  private static final String ARGUMENT_ERROR_MESSAGE;

  static {
    ARGUMENT_ERROR_MESSAGE = "method need more than 2 boolean argument";
  }

  /**
   * AND (logical conjunction)
   * @param bools more than 2 boolean arguments
   * @return All arguments is true, return value is true. <br>
   * Otherwise it is false.
   * @exception IllegalArgumentException
   * if arguments is null or less than 2 thow it.
   */
  public static boolean and(boolean... bools) {
    if (bools == null || bools.length < 2) {
      String message = "and " + ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
    boolean result = true;
    for (boolean bool : bools) {
      result = result && bool;
    }
    return result;
  }

  /**
   * OR (logical disjunction)
   * @param bools more than 2 boolean arguments
   * @return All arguments is false, return value is false.<br>
   * Otherwise it is true.
   * @exception IllegalArgumentException
   * If arguments is null or less than 2 throw it
   */
  public static boolean or(boolean... bools) {
    if (bools == null || bools.length < 2) {
      String message = "or " + ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
    boolean result = false;
    for (boolean bool : bools) {
      result = result || bool;
    }
    return result;
  }

  /**
   * NAND (Sheffer Stroke "↑" ex. <samp>p ↑ q</samp>)
   * @param bools more than 2 boolean arguments
   * @return arguments (p, q), return p↑q
   * @exception IllegalArgumentException
   * If arguments is null or less than 2 throw it
   * @see #and(boolean[])
   */
  public static boolean nand(boolean... bools) {
    if (bools == null || bools.length < 2) {
      String message = "nand " + ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
    return !and(bools);
  }

  /**
   * XOR (Exclusive disjunction)
   * @param bools
   * @return All arguments is same, return value is false.<br>
   * Otherwise it is true.
   * @exception IllegalArgumentException
   * If arguments is null or less than 2 throw it
   * @see #or(boolean[])
   * @see #nand(boolean[])
   */
  public static boolean xor(boolean... bools) {
    if (bools == null || bools.length < 2) {
      String message = "xor " + ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
    return or(bools) && nand(bools);
  }

  /**
   * IMP (material conditional (p -> q))
   * @param p logical element
   * @param q logical element
   * @return p impile q
   */
  public static boolean imp(boolean p, boolean q) {
    return !p || q;
  }

  /**
   * EQ (logical biconditional (p <-> q))
   * @param bools more than 2 boolean arguments
   * @return All arguments is same, return true. Otherwise it is false.
   * @exception IllegalArgumentException 
   * If arguments is null or less than 2 throw it
   * @see #xor(boolean[])
   */
  public static boolean eq(boolean... bools) {
    if (bools == null || bools.length < 2) {
      String message = "eq " + ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
    return !xor(bools);
  }
}
