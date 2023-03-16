package pl.sdacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

class PangramCheckerTest {

    @Test
    void testIsPangramShouldReturnTrue() {
        // given
        List<String> sentencesList = List.of(
                "The quick brown fox jumps over the lazy dog.",
                "Two driven jocks help fax my big quiz",
                "Pack my box with five dozen liquor jugs",
                "The five boxing wizards jump quickly",
                "Bright vixens jump; dozy fowl quack",
                "Jackdaws love my big sphinx of quartz",
                "John quickly extemporized five tow bags",
                "Waltz, nymph, for quick jigs vex Bud",
                "Quick wafting zephyrs vex bold Jim");

        for (String sentence : sentencesList) {
            // when
            boolean actualResult = PangramChecker.isPangram(sentence);

            // then
            Assertions.assertTrue(actualResult);
        }

        sentencesList.forEach(pangram -> {
            // when
            boolean result = PangramChecker.isPangram(pangram);

            // then
            Assertions.assertTrue(result);
        });
    }

    @Test
    void testIsPangramShouldReturnFalse() {
        // given
        List<String> sentencesList = List.of(" ", "    ", "over the lazy dog.", "my big quiz", "liquor jugs");

        // when/then
        sentencesList.forEach(pangram -> Assertions.assertFalse(PangramChecker.isPangram(pangram)));
    }

    @Test
    public void testIsPangramNullParam() {
        // given
        String text = null;

        // when
        Executable executable = () -> PangramChecker.isPangram(text);

        // then
        Assertions.assertThrows(IllegalArgumentException.class, executable);
    }
}