package pl.sdacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorMockitoTest {

    @Mock
    private Calculator calculator;

    @BeforeEach
    void reset(){
        Mockito.reset(calculator);
    }

    @Test
    void testSumSuccess() {
        // given
        final double a = 1.5;
        final double b = 1.5;

        final double expectedResult = 5.0;
        Mockito.when(calculator.sum(a, b)).thenReturn(expectedResult);

        // when
        double actualSum = calculator.sum(a, b);

        // then
        Mockito.verify(calculator).sum(a, b);
        Assertions.assertEquals(expectedResult, actualSum);
    }
}
