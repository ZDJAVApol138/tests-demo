package pl.sdacademy;


public class PangramChecker2 {

    public boolean isPangram(String sentence) {

        if (sentence == null) {
            throw new IllegalArgumentException("Parameter sentence cannot be 'null'");
        }

        return sentence.toLowerCase()
                .chars()
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == 26;
    }
}