package jp.ne.voqn;

/**
 * basic calculation class
 * @author VoQn
 */
public class Calculator {

  /**
   * If call "<code>sum(a,b,c,d);</code>",
   * return a + b + c + d
   * @param numbers
   * @return sum total of arguments. If arguments is null, return 0
   */
  public static Number sum(Number... numbers) {
    double value = 0;
    if (numbers != null) {
      for (Number number : numbers) {
        if (number != null) {
          value += number.doubleValue();
        }
      }
    }
    return value;
  }

  /**
   * If call "<code>product(a,b,c,d)</code>",
   * return a * b * c * d
   * @param numbers
   * @return product of argument. If arguments is null, return 0
   */
  public static Number product(Number... numbers) {
    double value = 1;
    if (numbers != null) {
      for (Number number : numbers) {
        if (number != null) {
          value *= number.doubleValue();
        }
      }
    }
    return numbers == null ? 0 : value;
  }

  /**
   * if call "<code>max(a,b,c)</code>"
   * and a &lt b &lt c , return c
   * @param numbers
   * @return A Object has maximum value of arguments.<br>
   * If arguments is null, return null.
   */
  public static Number max(Number... numbers) {
    double value = Double.MIN_VALUE;
    if (numbers != null) {
      for (Number number : numbers) {
        if (number != null) {
          value = Math.max(value, number.doubleValue());
        }
      }
    }
    return numbers == null ? null : value;
  }

  /**
   * if call "<code>min(a,b,c)</code>"
   * and a &lt b &lt c , return a
   * @param numbers
   * @return A Object has minimam value of arguments.<br>
   * If arguments is null, return null.
   */
  public static Number min(Number... numbers) {
    double value = Double.MAX_VALUE;
    if (numbers != null) {
      for (Number num : numbers) {
        if (num != null) {
        value = Math.min(value, num.doubleValue());
        }
      }
    }
    return numbers == null ? null : value;
  }

  /**
   * factorial(n) == n! = 1 * 2 * 3 * ... * (n-1) * n
   * @param n natural number
   * @return n! (<samp>0! = 1, 1! = 1</samp>)
   * @exception IllegalArgumentException 
   * if n &lt 0, throw it.
   */
  public static int factorial(int n) {
    int result = 1;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    for (int i = 1; i < n + 1; i++) {
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
   * if n &lt r, throw it
   * @see #factorial(int)
   */
  public static int permutation(int n, int r) {
    if (n < r) {
      throw new IllegalArgumentException();
    }
    return factorial(n) / factorial(n - r);
  }

  /**
   * calculate permutation (repeated) nΠr
   * @param n number of all elements
   * @param r number of selected elements
   * @return number of pattern nΠr = n ^ r
   * @exception IllegalArgumentException 
   * If n < r, throw it
   */
  public static int repeatedPermutation(int n, int r) {
    if (n < r) {
      throw new IllegalArgumentException();
    }
    return Double.valueOf(Math.pow(n, r)).intValue();
  }

  /**
   * calculate number of combination pattern nCr
   * @param n number of all elements
   * @param r number of selected elements
   * @return number of combination pattern .. nCr = n! / (r! * (n - r)!)
   * @exception IllegalargumentException 
   * if n &lt r, throw it
   * @see #factorial(int)
   */
  public static int combination(int n, int r) {
    if (n < r) {
      throw new IllegalArgumentException();
    }
    return factorial(n) / (factorial(r) * factorial(n - r));
  }
}
