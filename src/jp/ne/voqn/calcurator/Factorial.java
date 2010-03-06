/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.ne.voqn.calcurator;

import static java.lang.Math.*;

/**
 * Basic calculation of factorial
 * @author VoQn
 */
public class Factorial {

  /**
   * Error message when argument is inacceptable negatve number.
   */
  private static String ERROR_MESSAGE_ARGUMENT_IS_NEGATIVE;

  static {
    ERROR_MESSAGE_ARGUMENT_IS_NEGATIVE = "argument not acceptable negative number";
  }

  /**
   *
   * Cheking argument number is negative number
   * @param n
   * @exception IllegalArgumentException
   * argument is negative number, throw it
   */
  static void checkNegativeIllegalArgument(int n) {
    if (n < 0) {
      String message = ERROR_MESSAGE_ARGUMENT_IS_NEGATIVE;
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
  public static long factorial(int n) {
    long result = 1;
    checkNegativeIllegalArgument(n);
    for (int i = 1, l = n + 1; i < l; i++) {
      result *= i;
    }
    return result;
  }

  /**
   * calculate Stiling's approximation
   * @param n
   * @return
   */
  public static double approximation(int n) {
    checkNegativeIllegalArgument(n);
    double result = 1;
    if (n != 0) {
      result = sqrt(2 * PI * n) * pow(n, n) / pow(E, n);
    }
    return result;
  }

}
