package pl.sdacademy;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void testIsEvenTrue(int evenNumber) {
        // when
        boolean even = NumberUtils.isEven(evenNumber);

        // then
        Assertions.assertThat(even)
                .isEqualTo(true)
                .isTrue()
                .asString()
                .startsWithIgnoringCase("t");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7})
    void testIsEvenFalse(int oddNumber) {
        // when
        boolean odd = NumberUtils.isEven(oddNumber);

        // then
        Assertions.assertThat(odd)
                .isFalse()
                .asString()
                .endsWithIgnoringCase("E");
    }

}