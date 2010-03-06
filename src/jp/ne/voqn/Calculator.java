package jp.ne.voqn;

/**
 * basic calculation class
 * @author VoQn
 */
public class Calculator {

  /**
   * Error message when argument array is null or empty. 
   */
  private static String ERROR_MESSAGE_ARGUMENT_IS_EMPTY;

  static {
    ERROR_MESSAGE_ARGUMENT_IS_EMPTY = " arguments not acceptable null or empty array";
  }

  /**
   * Checking number array arguments is empty or not.
   * @param numbers
   * @throws IllegalArgumentException
   * arguments is null or empty array, throw it;
   */
  private static void checkEmptyArguments(double ... numbers){
    if (numbers == null || numbers.length == 0) {
      String message = ERROR_MESSAGE_ARGUMENT_IS_EMPTY;
      throw new IllegalArgumentException(message);
    }
  }

  /**
   * If call "<code>sum(a,b,c,d);</code>",
   * return a + b + c + d
   * @param numbers
   * @return sum total of arguments.
   * @exception IllegalArgumentException
   * If arguments is null or empty, throw it.
   * @see #isEmpty(java.lang.Number[])
   */
  public static double sum(double... numbers) {
    checkEmptyArguments(numbers);
    double value = 0;
    for (Number number : numbers) {
      if (number != null) {
        value += number.doubleValue();
      }
    }
    return value;
  }

  /**
   * If call "<code>product(a,b,c,d)</code>",
   * return a * b * c * d
   * @param numbers
   * @return product of argument.
   * @exception IllegalArgumentException
   * If arguments is null or empty array, throw it.
   * @see #isEmpty(java.lang.Number[])
   */
  public static double product(double... numbers) {
    checkEmptyArguments(numbers);
    double value = 1;
    for (Number number : numbers) {
      if (number != null) {
        value *= number.doubleValue();
      }
    }
    return value;
  }

  /**
   * if call "<code>max(a,b,c)</code>"
   * and a &lt b &lt c , return c
   * @param numbers
   * @return A Object has maximum value of arguments.<br>
   * If arguments is null or empty array, return null.
   * @see #isEmpty(java.lang.Number[])
   */
  public static double max(double... numbers) {
    checkEmptyArguments(numbers);
    double value = Double.MIN_VALUE;
    for (Number number : numbers) {
      if (number != null) {
        value = Math.max(value, number.doubleValue());
      }
    }
    return value;
  }

  /**
   * if call "<code>min(a,b,c)</code>"
   * and a &lt b &lt c , return a
   * @param numbers
   * @return A Object has minimam value of arguments.
   * @exception IllegalArgumentException
   * If arguments is null or empty array, throw it.
   * @see #isEmpty(java.lang.Number[]) 
   */
  public static double min(double... numbers) {
    checkEmptyArguments(numbers);
    double value = Double.MAX_VALUE;
    for (Number num : numbers) {
      if (num != null) {
        value = Math.min(value, num.doubleValue());
      }
    }
    return value;
  }
}
