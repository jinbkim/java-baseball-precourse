package baseball.view;

import baseball.utils.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class GameInputString {

    private static final String REQUEST_NUMBER = "숫자를 입력해주세요 : ";
    private static final InputValidator inputValidator = new InputValidator();


    public GameInputString() {
    }

    public String requestNumber() {
        System.out.print(REQUEST_NUMBER);
        String input = Console.readLine();
        if (!inputValidator.isValidRequestNumber(input)) {
            throw new IllegalArgumentException();
        }
        return input;
    }
}
