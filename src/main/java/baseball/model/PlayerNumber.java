package baseball.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerNumber {

    private List<Integer> numbers;

    public PlayerNumber(String stringNumber) {
        numbers = Arrays.stream(stringNumber.split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }

    public boolean isExist(int number) {
        return numbers.contains(number);
    }
}
