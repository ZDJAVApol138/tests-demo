package pl.sdacademy;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testSumHappyPath() {
        // given
        final double a = 3.3;
        final double b = 4.2;
        final double expectedResult = 7.5;

        // when
        final double actualResult = calculator.sum(a, b);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSubtractHappyPath() {
        // given
        final double a = 4.3;
        final double b = 1.3;
        final double expectedResult = 3.0;

        // when
        final double actualResult = calculator.subtract(a, b);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDivideIntVersionHappyPath() {
        // given
        final int a = 4;
        final int b = 2;
        final int expectedResult = 2;

        // when
        final int actualResult = calculator.divide(a, b);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Disabled
    void testDivideIntVersionDivisionByZero() {
        // given
        final int a = 4;
        final int b = 0;

        // when
        Executable executable = () -> calculator.divide(a, b);

        // then
        Assertions.assertThrows(ArithmeticException.class, executable);
    }

}
