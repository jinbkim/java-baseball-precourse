package baseball.utils;

import java.util.Arrays;
import java.util.regex.Pattern;

public class InputValidator {

    private static final String NUMBER_REQUEST_REGEXP = "^[1-9]{3}$";
    private static final String REGAME_REQUEST_REGEXP = "^[1-2]{1}$";
    private static final String BLANK_REGEXP = "";

    public InputValidator() {
    }

    public boolean isValidNumberRequest(String input) {
        return Pattern.matches(NUMBER_REQUEST_REGEXP, input) && isNotDuplicatedNumber(input);
    }

    private boolean isNotDuplicatedNumber(String input) {
        return Arrays.stream(input.split(BLANK_REGEXP))
            .distinct()
            .count() == input.length();
    }

    public boolean isValidRegameRequest(String input) {
        return Pattern.matches(REGAME_REQUEST_REGEXP, input);
    }
}
