package baseball.utils;

import java.util.Arrays;
import java.util.regex.Pattern;

public class InputValidator {

    public static final String PLAYER_NUM_REGEX = "^[1-9]{3}$";
    public static final String REGAME_REGEX = "^[1-2]{1}$";

    public void validatePlayerNumber(String stringNumber) {
        if (!Pattern.matches(PLAYER_NUM_REGEX, stringNumber)) {
            throw new IllegalArgumentException();
        }
        if (Arrays.stream(stringNumber.split(""))
            .distinct()
            .count() != stringNumber.length()) {
            throw new IllegalArgumentException();
        }
    }

    public void validateIsRegame(String isRegame) {
        if (!Pattern.matches(REGAME_REGEX, isRegame)) {
            throw new IllegalArgumentException();
        }
    }
}
