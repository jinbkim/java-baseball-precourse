package baseball.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GameNumber {

    private List<Integer> gameNumberList;

    public GameNumber() {

    }

    public Integer getGameNumberByIndex(int index) {
        return gameNumberList.get(index);
    }

    public void setGameNumberList(String input) {
        System.out.println(input);
        gameNumberList = Arrays.stream(input.split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }
}
