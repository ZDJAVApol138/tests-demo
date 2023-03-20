package pl.sdacademy;

import java.util.Random;

/**
 * @author Szymon Józefczuk
 * @version 1.0.0
 */
public class StringUtils {

    private final static Random random = new Random();

    /**
     * Poprawny email powinien byc złożony z przynajmniej jednego znaku,
     * małpy '@' następnie znowu przynajmniej jednego
     * znaku oraz tak zwanego "domain suffix" => .com .pl .uk itd
     * <p>
     * e.g Poprawne email: "example@gmail.com", "nickname@o2.pl", "n@p.eu"
     * <p>
     * e.g  Niepoprawne email: "@gmail.com", "nickname@o2.p", "n@.eu", "   @example.uk"
     *
     * @param email Email do weryfikacji
     * @return {@code true} jeżeli email jest poprawny lub {@code flase} gdy email jest {@code null}, lub niepoprawny.
     */
    public static boolean isEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches("\\w+@\\w+\\.[a-zA-Z]{2,}");
    }

    /**
     * Metoda generuje pseudo przypadkowy text o podanej długości
     *
     * @param length Parametr wyznaczający długość tekstu
     * @return {@code String} - wygenerowany pseudo randomowy tekst
     */
    public static String generateRandomText(int length) {

        if (length <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ascii = (char) random.nextInt(33, 127);
            sb.append(ascii);
        }

        return sb.toString();
    }

    /**
     * Metoda generuje pseudo przypadkowy tekst o podanej długości
     *
     * @param text Tekst, który ma zostać przekształcony
     * @return {@code String} - Przekształcony tekst
     */
    public static String capitalize(String text) {
//        if (text == null || "".equals(text.trim())) {
//            return "";
//        }
//        return text.substring(0, 1).toUpperCase() + text.substring(1);

        return text == null || "".equals(text.trim()) ? "" : text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}