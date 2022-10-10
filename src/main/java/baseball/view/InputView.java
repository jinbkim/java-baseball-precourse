package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String requestNumber() {
        return requestInput(OutputView.REQUEST_NUMBER);
    }

    public String requestRegame() {
        return requestInput(OutputView.IS_REGAME);
    }

    private String requestInput(String input) {
        System.out.print(input);
        return Console.readLine();
    }
}
