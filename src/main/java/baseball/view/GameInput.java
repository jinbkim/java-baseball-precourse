package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class GameInput {

    private static final String INPUT_NUMBER = "숫자를 입력해주세요 : ";

    private String input;

    public GameInput() {

    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setInput() {
        System.out.print(INPUT_NUMBER);
        String input = Console.readLine();
        setInput(input);
    }
}
