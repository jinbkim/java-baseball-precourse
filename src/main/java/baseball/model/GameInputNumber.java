package baseball.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameInputNumber {

    private List<Integer> inputNumberList;

    public GameInputNumber() {

    }

    public List<Integer> getInputNumberList() {
        return inputNumberList;
    }

    public void setInputNumberList(String input) {
        inputNumberList = Arrays.stream(input.split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }
}
