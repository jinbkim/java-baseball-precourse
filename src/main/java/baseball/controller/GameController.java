package baseball.controller;

import baseball.model.AnswerNumber;
import baseball.model.PlayerNumber;
import baseball.view.InputView;

public class GameController {

    private final InputView inputView = new InputView();

    public void run() {
        String stringNumber = inputView.requestNumber();
        AnswerNumber answerNumber = new AnswerNumber();
        PlayerNumber playerNumber = new PlayerNumber(stringNumber);
    }
}
