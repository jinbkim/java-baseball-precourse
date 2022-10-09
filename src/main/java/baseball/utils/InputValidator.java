package baseball.utils;

import java.util.Arrays;
import java.util.regex.Pattern;

public class InputValidator {

    public static final String PLAYER_NUMBER_REGEX = "^[1-9]{3}$";

    public void validatePlayerNumber(String stringNumber) {
        if (!Pattern.matches(PLAYER_NUMBER_REGEX, stringNumber)) {
            throw new IllegalArgumentException();
        }
        if (Arrays.stream(stringNumber.split(""))
            .distinct()
            .count() != stringNumber.length()) {
            throw new IllegalArgumentException();
        }
    }
}
