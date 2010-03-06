/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.ne.voqn.calcurator;

import static jp.ne.voqn.calcurator.Factorial.*;

/**
 * basic calculation of Combinatorics
 * @author VoQn
 * @see Factorial
 */
public class Combinatorics {

  /**
   * Error message then argument over the range
   */
  private static String ERROR_MESSAGE_ARGUMENTS_OVER_THE_RANGE;

  static {
    ERROR_MESSAGE_ARGUMENTS_OVER_THE_RANGE = "2nd arguments is over the 1st number";
  }

  /**
   * Cheking the 2nd argument over the 1st one.
   * @param n
   * @param r
   * @exception IllegalArgumentException
   * if n &lt r, throw it.
   */
  private static void checkOutOfRangeArgument(int lowlim, int n, int maxlim) {
    if (n < lowlim || maxlim < n) {
      String message = ERROR_MESSAGE_ARGUMENTS_OVER_THE_RANGE;
      throw new IllegalArgumentException(message);
    }
  }

  /**
   * calculate permutation ... nPr = n! / (n - r)!
   * @param n number of all elements
   * @param r number of selected elements
   * @return number of different pattern
   * @exception IllegalArgumentException
   * If n &lt 0 || n &lt r, throw it
   * @see Factorial#factorial(int)
   */
  public static long permutation(int n, int r) {
    checkNegativeIllegalArgument(n);
    checkNegativeIllegalArgument(r);
    checkOutOfRangeArgument(0, r, n);
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
    checkNegativeIllegalArgument(r);
    checkOutOfRangeArgument(0, r, n);
    return Double.valueOf(Math.pow(n, r)).intValue();
  }

  /**
   * calculate number of combination pattern nCr
   * @param n number of all elements
   * @param r number of selected elements
   * @return number of combination pattern .. nCr = n! / (r! * (n - r)!)
   * @exception IllegalargumentException
   * if n &lt 0 or n &lt r, throw it
   * @see Factorial#factorial(int)
   */
  public static long combination(int n, int r) {
    checkNegativeIllegalArgument(n);
    checkNegativeIllegalArgument(r);
    checkOutOfRangeArgument(0, r, n);
    return factorial(n) / (factorial(r) * factorial(n - r));
  }

  /**
   * caluculate number of repeated combination pattern nHr
   * @param n number of elements kind
   * @param r number of selected elements
   * @return number of repeated combination pattern .. nHr = (n+r+1)Cr
   * @exception IllegalArgumentException
   * if n &lt 0 or n &lt r, throw it
   * @see #combination(int, int)
   */
  public static long repeatedCombination(int n, int r) {
    checkNegativeIllegalArgument(n);
    checkNegativeIllegalArgument(r);
    checkOutOfRangeArgument(0, r, n);
    return combination(n + r + 1, r);
  }
}
