// -*- mode: java; :coding: utf-8; -*-
package jp.ne.voqn.calcurator;

import java.math.BigDecimal;

/**
 * Calculation combined arguments class
 * @author VoQn
 */
public class Combiner {

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
    private static void checkEmptyArguments(Number... numbers) {
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
    public static double sum(Number... numbers) {
        checkEmptyArguments(numbers);
        BigDecimal value = BigDecimal.ZERO;
        for (Number number : numbers) {
            value = value.add(BigDecimal.valueOf(number.doubleValue()));
        }
        return value.doubleValue();
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
    public static double product(Number... numbers) {
        checkEmptyArguments(numbers);
        BigDecimal value = BigDecimal.ONE;
        for (Number number : numbers) {
            value = value.multiply(BigDecimal.valueOf(number.doubleValue()));
        }
        return value.doubleValue();
    }
}
