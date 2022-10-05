package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class GameInputString {

    private static final String REQUEST_NUMBER = "숫자를 입력해주세요 : ";

    public GameInputString() {
    }

    public String requestNumber() {
        System.out.print(REQUEST_NUMBER);
        String input = Console.readLine();
        return input;
    }
}
