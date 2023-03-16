package pl.sdacademy;

/**
 * Klasa udostępniająca podstawowe metody do działań matematycznych
 *
 * @author Szymon Józefczuk
 * @version 1.0.0
 */
public class Calculator {

    /**
     * Metoda sumująca dwie liczby zmiennoprzecinkowe.
     * @param a wartość pierwszej liczby
     * @param b wartość drugiej liczby
     * @return {@code double} - suma podanych liczb
     */
    public double sum(double a, double b) {
        return a + b;
    }

    /**
     * Odejmowania dwóch liczb zmiennoprzecinkowych.
     * @param a wartość pierwszej liczby
     * @param b wartość drugiej liczby
     * @return {@code double} - różnica dwóch liczb
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Mnożenie dwóch liczb zmiennoprzecinkowych.
     * @param a wartość pierwszej liczby
     * @param b wartość mnożnika liczby
     * @return {@code double} - iloczyn dwóch liczb
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Dzielenie dwóch liczb całkowitych.
     * @param a wartość pierwszej liczby
     * @param b wartość dzielnika liczby
     * @return {@code int} - iloraz dwóch liczb
     */
    public int divide(int a, int b) {
        return a / b;
    }

    /**
     * Dzielenie dwóch liczb zmiennoprzecinkowych.
     * @param a wartość pierwszej liczby
     * @param b wartość dzielnika liczby
     * @return {@code double} - iloraz dwóch liczb
     */
    public double divide(double a, double b) {
        return a / b;
    }
}