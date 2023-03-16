package pl.sdacademy;

/**
 * Klasa utility udostępniająca metodę do walidacji pangramu.
 * <p>
 * Pangram (gr. pan gramma – każda litera). Jest to krótkie zdanie zawierające wszystkie litery danego języka przynajmniej raz.
 * Przyjmujemy, że wielkość użytych liter jest bez znaczenia.
 * <p>
 * e.g "The quick brown fox jumps over the lazy dog"
 *
 * @author Szymon Józefczuk
 * @version 1.0.0
 */
public class PangramChecker {

    /**
     * Metoda sprawdzająca, czy dany tekst jest pangramem.
     *
     * @param sentence Tekst do sprawdzenia
     * @return {@code boolean} - {@code true} jeżeli tekst jest pangram bądź {@code false} w inny przypadku
     * @throws IllegalArgumentException w przypadku gdy {@param sentence} jest {@code null}
     */
    public static boolean isPangram(String sentence) {

        if (sentence == null) {
            throw new IllegalArgumentException("Parameter sentence cannot be 'null'");
        }
//        sentence = sentence.toLowerCase();
//
//        for (char letter = 'a'; letter <= 'z'; letter++) {
//
//            if (!sentence.contains(String.valueOf(letter))) {
//                return false;
//            }
//        }
//        return true;

        return sentence.toLowerCase()
                .chars()
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == 26;
    }
}