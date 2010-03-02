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
 
  /**
   * Error message when argument is inacceptable negatve number.
   */
  private static String ERROR_MESSAGE_ARGUMENT_IS_NEGATIVE;

  /**
   * Error message then argument over the range
   */
  private static String ERROR_MESSAGE_ARGUMENTS_OVER_THE_RANGE;

  static {
    ERROR_MESSAGE_ARGUMENT_IS_EMPTY = " arguments not acceptable null or empty array";
    ERROR_MESSAGE_ARGUMENT_IS_NEGATIVE = "argument not acceptable negative number";
    ERROR_MESSAGE_ARGUMENTS_OVER_THE_RANGE = "2nd arguments is over the 1st number";
  }

  /**
   * Checking number array arguments is empty or not.
   * @param numbers
   * @return arguments is null or empty array, return true;
   */
  private static boolean isEmpty(double... numbers) {
    return numbers == null || numbers.length == 0;
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
    if (isEmpty(numbers)) {
      String message = ERROR_MESSAGE_ARGUMENT_IS_EMPTY;
      throw new IllegalArgumentException(message);
    }
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
    if (isEmpty(numbers)) {
      String message = ERROR_MESSAGE_ARGUMENT_IS_EMPTY;
      throw new IllegalArgumentException(message);
    }
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
    if (isEmpty(numbers)) {
      String message = ERROR_MESSAGE_ARGUMENT_IS_EMPTY;
      throw new IllegalArgumentException(message);
    }
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
    if (isEmpty(numbers)) {
      String message = ERROR_MESSAGE_ARGUMENT_IS_EMPTY;
      throw new IllegalArgumentException(message);
    }
    double value = Double.MAX_VALUE;
    for (Number num : numbers) {
      if (num != null) {
        value = Math.min(value, num.doubleValue());
      }
    }
    return value;
  }

  /**
   * factorial(n) == n! = 1 * 2 * 3 * ... * (n-1) * n
   * @param n natural number
   * @return n! (<samp>0! = 1, 1! = 1</samp>)
   * @exception IllegalArgumentException 
   * If n &lt 0, throw it.
   */
  public static int factorial(int n) {
    int result = 1;
    if (n < 0) {
      String message = ERROR_MESSAGE_ARGUMENT_IS_NEGATIVE;
      throw new IllegalArgumentException(message);
    }
    for (int i = 1, l = n + 1; i < l; i++) {
      result *= i;
    }
    return result;
  }

  /**
   * calculate permutation ... nPr = n! / (n - r)!
   * @param n number of all elements
   * @param r number of selected elements
   * @return number of different pattern
   * @exception IllegalArgumentException 
   * If n &lt 0 || n &lt r, throw it
   * @see #factorial(int)
   */
  public static int permutation(int n, int r) {
    boolean isNegative = n < 0;
    boolean overTheRange = n < r;
    if (isNegative || overTheRange) {
      String message = "";
      message += isNegative ? ERROR_MESSAGE_ARGUMENT_IS_NEGATIVE : "";
      message += overTheRange ? ERROR_MESSAGE_ARGUMENTS_OVER_THE_RANGE : "";
      throw new IllegalArgumentException(message);
    }
    return factorial(n) / factorial(n - r);
  }

  /**
   * calculate permutation (repeated) nΠr
   * @param n number of all elements
   * @param r number of selected elements
   * @return number of pattern nΠr = n ^ r
   * @exception IllegalArgumentException 
   * If n &lt 0 or n &lt r, throw it
   */
  public static int repeatedPermutation(int n, int r) {
    boolean isNegative = n < 0;
    boolean overTheRange = n < r;
    if (isNegative || overTheRange) {
      String message = "";
      message += isNegative ? ERROR_MESSAGE_ARGUMENT_IS_NEGATIVE : "";
      message += overTheRange ? ERROR_MESSAGE_ARGUMENTS_OVER_THE_RANGE : "";
      throw new IllegalArgumentException(message);
    }
    return Double.valueOf(Math.pow(n, r)).intValue();
  }

  /**
   * calculate number of combination pattern nCr
   * @param n number of all elements
   * @param r number of selected elements
   * @return number of combination pattern .. nCr = n! / (r! * (n - r)!)
   * @exception IllegalargumentException 
   * if n < 0 &lt 0 or n &lt r, throw it
   * @see #factorial(int)
   */
  public static int combination(int n, int r) {
    boolean isNegative = n < 0;
    boolean overTheRange = n < r;
    if (isNegative || overTheRange) {
      String message = "";
      message += isNegative ? ERROR_MESSAGE_ARGUMENT_IS_NEGATIVE : "";
      message += overTheRange ? ERROR_MESSAGE_ARGUMENTS_OVER_THE_RANGE : "";
      throw new IllegalArgumentException(message);
    }
    return factorial(n) / (factorial(r) * factorial(n - r));
  }
}
