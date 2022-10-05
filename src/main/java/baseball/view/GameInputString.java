package baseball.view;

import baseball.utils.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class GameInputString {

    private static final GameOutputString gameOutputString = new GameOutputString();
    private static final InputValidator inputValidator = new InputValidator();
    private static final String REGAME = "1";


    public GameInputString() {
    }

    public String requestNumber() {
        gameOutputString.requestNumber();
        String input = Console.readLine();
        if (!inputValidator.isValidRequestNumber(input)) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    public boolean requestRegame() {
        String input = Console.readLine();
        if (!inputValidator.isValidRequestRegame(input)) {
            throw new IllegalArgumentException();
        }
        if (input.equals(REGAME)) {
            return true;
        }
        return false;
    }
}
