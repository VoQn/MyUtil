// -*- mode: java; cording: utf-8; -*-
package jp.ne.voqn.calcurator;

/**
 *
 * @author VoQn
 */
public class Compare {

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
     * if call "<code>max(a,b,c)</code>"
     * and a &lt b &lt c , return c
     * @param numbers
     * @return A Object has maximum value of arguments.<br>
     * If arguments is null or empty array, return null.
     * @see #isEmpty(java.lang.Number[])
     */
    public static double max(Number... numbers) {
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
    public static double min(Number... numbers) {
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
