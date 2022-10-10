package baseball.controller;

import baseball.model.AnswerNumber;
import baseball.model.GameResult;
import baseball.model.PlayerNumber;
import baseball.view.InputView;

public class GameController {

    private final InputView inputView = new InputView();

    public void run() {
        while (true) {
            AnswerNumber answerNumber = new AnswerNumber();
            String stringNumber = inputView.requestNumber();
            PlayerNumber playerNumber = new PlayerNumber(stringNumber);
            GameResult gameResult = new GameResult(answerNumber.getNumbers(), playerNumber.getNumbers());
            gameResult.printGameResult();
            break;
        }
    }
}
