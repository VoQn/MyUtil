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
    ARGUMENT_ERROR_MESSAGE = "this method can not accept less than 2 arguments";
  }

  /**
   * null check
   * @param bools
   * @exception IllegalArgumentException 
   * If arguments is null or less than 2, throw it.
   */
  private static void checkIllegalArgument(boolean... bools) {
    if (bools == null || bools.length < 2) {
      String message = ARGUMENT_ERROR_MESSAGE;
      throw new IllegalArgumentException(message);
    }
  }

  /**
   * AND (logical conjunction)
   * @param bools more than 2 boolean arguments
   * @return All arguments is true, return value is true. <br>
   * Otherwise it is false.
   * @exception IllegalArgumentException
   * if arguments is null or less than 2 arguments, thow it.
   * @see #checkIllegalArgument(boolean[])
   */
  public static boolean and(boolean... bools) {
    checkIllegalArgument(bools);
    boolean result = true;
    for (boolean bool : bools) {
      result = result && bool;
      if (!result) {
        break;
      }
    }
    return result;
  }

  /**
   * OR (logical disjunction)
   * @param bools more than 2 boolean arguments
   * @return All arguments is false, return value is false.<br>
   * Otherwise it is true.
   * @exception IllegalArgumentException
   * If arguments is null or less than 2 arguments, throw it.
   * @see #checkIllegalArgument(boolean[])
   */
  public static boolean or(boolean... bools) {
    checkIllegalArgument(bools);
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
   * If arguments is null or less than 2 arguments, throw it
   * @see #and(boolean[])
   * @see #checkIllegalArgument(boolean[])
   */
  public static boolean nand(boolean... bools) {
    checkIllegalArgument(bools);
    return !and(bools);
  }

  /**
   * XOR (Exclusive disjunction)
   * @param bools
   * @return All arguments is same, return value is false.<br>
   * Otherwise it is true.
   * @exception IllegalArgumentException
   * If arguments is null or less than 2 arguments, throw it
   * @see #checkIllegalArgument(boolean[])
   */
  public static boolean xor(boolean... bools) {
    checkIllegalArgument(bools);
    int c = 0;
    for (boolean bool : bools) {
      if (bool) {
        c++;
      }
      if (c > 1) {
        break;
      }
    }
    return c == 1;
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
   * If arguments is null or less than 2 arguments, throw it.
   * @see #checkIllegalArgument(bools)
   */
  public static boolean eq(boolean... bools) {
    checkIllegalArgument(bools);
    boolean stack = bools[0];
    boolean same = true;
    for (boolean bool : bools) {
      if (stack != bool) {
        same = false;
        break;
      }
    }
    return same;
  }
}
