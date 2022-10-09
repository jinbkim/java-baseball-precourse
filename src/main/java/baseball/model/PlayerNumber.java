package baseball.model;

import baseball.utils.InputValidator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerNumber {

    private final InputValidator inputValidator = new InputValidator();

    private List<Integer> numbers;

    public PlayerNumber(String stringNumber) {
        inputValidator.validatePlayerNumber(stringNumber);
        numbers = Arrays.stream(stringNumber.split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }

    public boolean isExist(int number) {
        return numbers.contains(number);
    }
}
