package baseball.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameInput {

    List<Integer> numbers;

    public GameInput() {
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(String input) {
        List<Integer> numbers = Arrays.stream(input.split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }
}
