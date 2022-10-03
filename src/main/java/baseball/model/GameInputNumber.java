package baseball.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameInputNumber {

    private List<Integer> inputNumberList;

    public GameInputNumber() {

    }

    public Integer getGameNumberByIndex(int index) {
        return inputNumberList.get(index);
    }

    public void setInputNumberList(String input) {
        System.out.println(input);
        inputNumberList = Arrays.stream(input.split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }
}
