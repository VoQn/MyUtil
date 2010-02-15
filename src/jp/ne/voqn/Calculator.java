/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.ne.voqn;

/**
 *
 * @author VoQn
 */
public class Calculator {

    /**
     *
     * @param numbers
     * @return A Object has value calculated by simple sum function from arguments.<br>
     * If arguments is null, return 0;
     */
    public static Number sum(Number... numbers) {
        double value = 0;
        if (numbers != null) {
            for (Number number : numbers) {
                if (number == null) {
                    continue;
                }
                value += number.doubleValue();
            }
        }
        return value;
    }

    /**
     *
     * @param numbers
     * @return A Object has value calculated by simple product function from arguments.<br>
     * If arguments is null, return 0;
     */
    public static Number product(Number... numbers) {
        double value = 1;
        if (numbers != null) {
            for (Number number : numbers) {
                if (number == null) {
                    continue;
                }
                value *= number.doubleValue();
            }
        }
        return numbers == null ? 0 : value;
    }

    /**
     *
     * @param numbers
     * @return A Object has maximum value of arguments.<br>
     * If arguments is null, return null.
     */
    public static Number max(Number... numbers) {
        double value = Double.MIN_VALUE;
        if (numbers != null) {
            for (Number number : numbers) {
                if (number == null) {
                    continue;
                }
                value = Math.max(value, number.doubleValue());
            }
        }
        return numbers == null ? null : value;
    }

    /**
     *
     * @param numbers
     * @return A Object has minimam value of arguments.<br>
     * If arguments is null, return null.
     */
    public static Number min(Number... numbers) {
        double value = Double.MAX_VALUE;
        if (numbers != null) {
            for (Number num : numbers) {
                if (num == null) {
                    continue;
                }
                value = Math.min(value, num.doubleValue());
            }
        }
        return numbers == null ? null : value;
    }

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

    public static int permutation(int n, int r) {
        if(n < r){
             throw new IllegalArgumentException();
        }
        return factorial(n) / factorial(n - r);
    }

    public static int repeatedPermutation(int n, int r){
        if(n < r){
            throw new IllegalArgumentException();
        }
        return Double.valueOf(Math.pow(n, r)).intValue();
    }

    public static int combination(int n, int r){
        if(n < r){
            throw new IllegalArgumentException();
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}