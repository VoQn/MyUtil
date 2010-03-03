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

  /**
   * Cheking argument number is negative number
   * @param n
   * @exception IllegalArgumentException
   * argument is negative number, throw it
   */
  private static void checkNegativeIllegalArgument(int n) {
    if (n < 0) {
      String message = ERROR_MESSAGE_ARGUMENT_IS_NEGATIVE;
      throw new IllegalArgumentException(message);
    }
  }

  /**
   * Cheking the 2nd argument over the 1st one.
   * @param n
   * @param r
   * @exception IllegalArgumentException
   * if n &lt r, throw it.
   */
  private static void checkOutOfRangeArgument(int n, int r) {
    if (n < r) {
      String message = ERROR_MESSAGE_ARGUMENTS_OVER_THE_RANGE;
      throw new IllegalArgumentException(message);
    }
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
    checkNegativeIllegalArgument(n);
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
    checkNegativeIllegalArgument(n);
    checkOutOfRangeArgument(n, r);
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
    checkNegativeIllegalArgument(n);
    checkOutOfRangeArgument(n, r);
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
    checkNegativeIllegalArgument(n);
    checkOutOfRangeArgument(n, r);
    return factorial(n) / (factorial(r) * factorial(n - r));
  }
}
