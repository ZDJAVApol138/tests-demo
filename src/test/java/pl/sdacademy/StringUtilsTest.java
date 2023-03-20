package pl.sdacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class StringUtilsTest {


    @ParameterizedTest
    @ValueSource(strings = {"example@gmail.com", "nickname@o2.pl", "n@p.eu"})
    void testIsEmailHappyPath(String validEmail) {
        // when
        boolean email = StringUtils.isEmail(validEmail);

        // then
        Assertions.assertTrue(email);
    }

    @NullSource
    @ParameterizedTest
    void testIsEmailNullParam(String nullParam) {
        // when
        boolean email = StringUtils.isEmail(nullParam);

        // then
        Assertions.assertFalse(email);
    }

    @EmptySource
    @ParameterizedTest
    void testIsEmailEmptyParam(String emptyParam) {
        // when
        boolean email = StringUtils.isEmail(emptyParam);

        // then
        Assertions.assertFalse(email);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testIsEmailEmptyOrNullParam(String invalidEmail) {
        // when
        boolean email = StringUtils.isEmail(invalidEmail);

        // then
        Assertions.assertFalse(email);
    }

    @ParameterizedTest
    @ValueSource(strings = {"@gmail.com", "nickname@o2.p", "n@.eu", "   @example.uk"})
    void testIsEmailInvalidEmail(String invalidEmail) {
        // when
        boolean email = StringUtils.isEmail(invalidEmail);

        // then
        Assertions.assertFalse(email);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 10, 23, 17, 100, 3453})
    void testGenerateRandomTextSuccess(int expectedLength) {
        // when
        String randomText = StringUtils.generateRandomText(expectedLength);
        int actualLength = randomText.length();

        // then
        Assertions.assertEquals(expectedLength, actualLength);

    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -2, -17})
    void testGenerateRandomTextZeroOrNegativeLength(int lengthInput) {
        // given
        int expectedLength = 0;

        // when
        String randomText = StringUtils.generateRandomText(lengthInput);
        int actualLength = randomText.length();

        // then
        Assertions.assertEquals(expectedLength, actualLength);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testCapitalizeNullOrEmptyParam(String invalidParam) {
        // given
        final String expected = "";

        // when
        final String actual = StringUtils.capitalize(invalidParam);

        // then
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> capitalizeParamsProvider() {
        return Stream.of(
//                String expected, String text
                Arguments.of("Sue", "sue"),
                Arguments.of("Bob", "bob"),
                Arguments.of("Kate", "kate"),
                Arguments.of("", null),
                Arguments.of("", "     ")
        );
    }

    @ParameterizedTest
    @MethodSource("capitalizeParamsProvider")
    void testCapitalizeHappyPath(String expected, String input) {
        // when
        final String actual = StringUtils.capitalize(input);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv" )
    void testCapitalize2(String expected, String input) {
        // when
        final String actual = StringUtils.capitalize(input);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"Sue,Sue", "Bob,bob"})
    void testCapitalize3(String expected, String input) {
        // when
        final String actual = StringUtils.capitalize(input);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
