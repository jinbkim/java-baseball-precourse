package baseball.controller;

import baseball.model.GameAnswerNumber;
import baseball.model.GameInputNumber;
import baseball.model.GameResult;
import baseball.view.GameInput;

public class GamePlay {

    private static final GameInput gameInput = new GameInput();
    private boolean isGameOver = false;

    public void start() {
        GameInputNumber gameInputNumber = new GameInputNumber();
        GameAnswerNumber gameAnswerNumber = new GameAnswerNumber();
        System.out.println(gameAnswerNumber.getAnswerNumberList());

        while (!isGameOver) {
            gameInput.setInput();
            gameInputNumber.setInputNumberList(gameInput.getInput());
            GameResult gameResult = new GameResult(gameInputNumber, gameAnswerNumber);
            System.out.println(gameResult.getGameResult());
            return;
        }
    }
}
