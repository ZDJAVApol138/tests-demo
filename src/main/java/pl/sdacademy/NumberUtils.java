
package pl.sdacademy;

/**
 * @author Szymon Józefczuk 
 */
public class NumberUtils {

    /**
     * Method returns {@code true} if {@code number} is even
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Method returns {@code true} if {@code number} is dividable by given {@code divider}
     */
    public static boolean isDividableBy(int number, int divider) {
        return number % divider == 0;
    }

    /**
     * Method returns square root of given {@code number}
     */
    public static double getSqrt(int number) {
        return Math.sqrt(number);
    }
}