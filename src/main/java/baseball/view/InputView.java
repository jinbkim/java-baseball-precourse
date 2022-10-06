package baseball.view;

import baseball.utils.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private InputValidator inputValidator = new InputValidator();

    private static final String REGAME = "1";


    public InputView() {
    }

    public String requestNumber() {
        System.out.println(OutputView.REQUEST_NUMBER);
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
