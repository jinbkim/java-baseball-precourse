package baseball.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputModel {

    private List<Integer> numbers;

    public InputModel() {
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(String input) {
        numbers = Arrays.stream(input.split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }
}
