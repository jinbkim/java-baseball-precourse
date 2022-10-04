package baseball.view;

import baseball.utils.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class GameInput {

    private static final String INPUT_NUMBER = "숫자를 입력해주세요 : ";
    private static final InputValidator inputValidator = new InputValidator();

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
        if (!inputValidator.isValidInput(input)) {
            throw new IllegalArgumentException();
        }
        setInput(input);
    }
}
