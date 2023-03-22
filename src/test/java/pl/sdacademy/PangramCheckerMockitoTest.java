package pl.sdacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PangramCheckerMockitoTest {

    private final PangramChecker2 checker = Mockito.mock(PangramChecker2.class);

    @BeforeEach
    void reset() {
        Mockito.reset(checker);
    }

    @Test
    void testIsPangramSuccess() {
        // given
        final String sentence = "The quick brown fox jumps over the lazy dog.";
        Mockito.when(checker.isPangram(Mockito.anyString())).thenReturn(true);

        // when
        final boolean actualResult = checker.isPangram(sentence);

        // then
        Mockito.verify(checker).isPangram(sentence);
        Assertions.assertTrue(actualResult);
    }
}
