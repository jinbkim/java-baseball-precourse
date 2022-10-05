package baseball.utils;

import java.util.Arrays;
import java.util.regex.Pattern;

public class InputValidator {

    private static final String REQUEST_NUMBER_REGEX = "^[1-9]{3}$";
    private static final int NUMBER_LENGTH = 3;


    public InputValidator() {
    }

    public boolean isValidRequestNumber(String input) {
        return Pattern.matches(REQUEST_NUMBER_REGEX, input) && hasNotDuplicatedNumber(input);
    }

    private boolean hasNotDuplicatedNumber(String input) {
        return Arrays.stream(input.split(""))
            .distinct()
            .count() == NUMBER_LENGTH;
    }
}
