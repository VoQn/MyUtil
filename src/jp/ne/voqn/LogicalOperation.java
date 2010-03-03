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
    ARGUMENT_ERROR_MESSAGE = "this method can not accept null argument";
  }

  /**
   * null check
   * @param bools
   * @exception IllegalArgumentException if arguments is null, throw it.
   */
  private static void checkIsArgumentNull(boolean... bools) {
    if (bools == null) {
      String message = ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
  }

  /**
   * AND (logical conjunction)
   * @param bools boolean arguments
   * @return All arguments is true, return value is true. <br>
   * Also empty array (not null, but boolean[0]), it is true.<br>
   * Otherwise it is false.
   * @exception IllegalArgumentException
   * if arguments is null thow it.
   */
  public static boolean and(boolean... bools) {
    checkIsArgumentNull(bools);
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
   * But empty array (not null, but boolean[0]), it is true.<br>
   * Otherwise it is true.
   * @exception IllegalArgumentException
   * If arguments is null.
   */
  public static boolean or(boolean... bools) {
    checkIsArgumentNull(bools);
    boolean result = bools.length >= 1 ? false : true;
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
   * If arguments is null throw it
   * @see #and(boolean[])
   */
  public static boolean nand(boolean... bools) {
    checkIsArgumentNull(bools);
    return !and(bools);
  }

  /**
   * XOR (Exclusive disjunction)
   * @param bools
   * @return All arguments is same, return value is false.<br>
   * Otherwise it is true.
   * @exception IllegalArgumentException
   * If arguments is null throw it
   * @see #or(boolean[])
   * @see #nand(boolean[])
   */
  public static boolean xor(boolean... bools) {
    checkIsArgumentNull(bools);
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
   * @param bools boolean arguments
   * @return All arguments is same, return true.<br>
   * Otherwise it is false.
   * @exception IllegalArgumentException 
   * If arguments is null throw it.
   * @see #xor(boolean[])
   */
  public static boolean eq(boolean... bools) {
    checkIsArgumentNull(bools);
    return !xor(bools);
  }
}
