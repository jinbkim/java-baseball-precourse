package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String requestNumber() {
        System.out.print(OutputView.REQUEST_NUMBER);
        return Console.readLine();
    }
}
