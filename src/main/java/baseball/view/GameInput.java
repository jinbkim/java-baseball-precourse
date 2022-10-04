package baseball.view;

import baseball.utils.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class GameInput {

    private static final String REQUEST_NUMBER = "숫자를 입력해주세요 : ";
    private static final String REQUEST_REGAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final InputValidator inputValidator = new InputValidator();

    public GameInput() {

    }

    public String requestNumber() {
        System.out.print(REQUEST_NUMBER);
        String input = Console.readLine();
        if (!inputValidator.isValidNumberRequest(input)) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    public boolean requestRegame() {
        System.out.println(REQUEST_REGAME);
        String input = Console.readLine();
        if (!inputValidator.isValidRegameRequest(input)) {
            throw new IllegalArgumentException();
        }
        if (input.equals("1")) {
            return true;
        }
        return false;
    }
}
