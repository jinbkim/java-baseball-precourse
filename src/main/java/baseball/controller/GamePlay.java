package baseball.controller;

import baseball.model.GameAnswerNumber;
import baseball.model.GameInputNumber;
import baseball.model.GameResult;
import baseball.view.GameInput;

public class GamePlay {

    private static final GameInput gameInput = new GameInput();
    private static final GameInputNumber gameInputNumber = new GameInputNumber();
    private static final GameAnswerNumber gameAnswerNumber = new GameAnswerNumber();
    private static final GameResult gameResult = new GameResult();

    public void start() {
        while (gameResult.isRegame()) {
            play();
        }
    }

    private void play() {
        gameAnswerNumber.setAnswerNumberList();
        System.out.println(gameAnswerNumber.getAnswerNumberList());

        while (true) {
            String input = gameInput.requestNumber();
            gameInputNumber.setInputNumberList(input);
            gameResult.setGameResult(gameInputNumber, gameAnswerNumber);
            System.out.println(gameResult.getGameResult() + "\n");
            if (gameResult.isGameWin()) {
                gameResult.setRegame(gameInput.requestRegame());
                break;
            }
        }
    }
}
