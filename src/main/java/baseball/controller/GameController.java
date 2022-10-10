package baseball.controller;

import baseball.model.AnswerNumber;
import baseball.model.GameResult;
import baseball.model.PlayerNumber;
import baseball.view.InputView;

public class GameController {

    private static final String REGAME = "1";

    private final InputView inputView = new InputView();

    public void run() {
        boolean isRegame = true;

        while (isRegame) {
            gameStart();
            isRegame = inputView.requestRegame()
                .equals(REGAME);
        }
    }

    public void gameStart() {
        AnswerNumber answerNumber = new AnswerNumber();
        boolean isGameWin = false;

        while (!isGameWin) {
            String stringNumber = inputView.requestNumber();
            PlayerNumber playerNumber = new PlayerNumber(stringNumber);
            GameResult gameResult = new GameResult(answerNumber.getNumbers(), playerNumber.getNumbers());
            isGameWin = gameResult.isGameWin();
        }
    }
}
