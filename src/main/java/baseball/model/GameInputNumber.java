package baseball.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameInputNumber {

    private static final String BLANK_REGEXP = "";
    private List<Integer> inputNumberList;

    public GameInputNumber() {

    }

    public List<Integer> getInputNumberList() {
        return inputNumberList;
    }

    public void setInputNumberList(String input) {
        System.out.println(input);
        inputNumberList = Arrays.stream(input.split(BLANK_REGEXP))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }
}
