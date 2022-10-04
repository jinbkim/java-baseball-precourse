package baseball.utils;

import java.util.Arrays;
import java.util.regex.Pattern;

public class InputValidator {

    private static final String NATURAL_NUMBER_REGEXP = "^[1-9]*$";
    private static final String NUMBER_LENGTH_REGEXP = "^\\d{3}$";
    private static final String BLANK_REGEXP = "";

    public InputValidator() {
    }

    public boolean isValidInput(String input) {
        return isRightNumberLength(input) && isNaturalNumber(input) && isNotDuplicatedNumber(input);
    }

    private boolean isRightNumberLength(String input) {
        return Pattern.matches(NUMBER_LENGTH_REGEXP, input);
    }


    private boolean isNaturalNumber(String input) {
        return Pattern.matches(NATURAL_NUMBER_REGEXP, input);
    }

    private boolean isNotDuplicatedNumber(String input) {
        return Arrays.stream(input.split(BLANK_REGEXP))
            .distinct()
            .count() == input.length();
    }
}
