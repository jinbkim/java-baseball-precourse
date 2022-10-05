package baseball.controller;

import baseball.model.GameAnswerNumber;
import baseball.model.GameInputNumber;
import baseball.model.GameResult;
import baseball.view.GameInput;
import java.util.List;

public class GamePlay {

    private static final GameInput gameInput = new GameInput();
    private static final GameInputNumber gameInputNumber = new GameInputNumber();
    private static final GameAnswerNumber gameAnswerNumber = new GameAnswerNumber();
    private static final GameResult gameResult = new GameResult();

    public void start() {
        gameResult.setRegame(true);
        while (gameResult.isRegame()) {
            play();
        }
    }

    private void play() {
        gameAnswerNumber.setAnswerNumberList();
        while (true) {
            String input = gameInput.requestNumber();
            gameInputNumber.setInputNumberList(input);
            List<Integer> inputNumberList = gameInputNumber.getInputNumberList();
            List<Integer> answerNumberList = gameAnswerNumber.getAnswerNumberList();
            gameResult.setGameResult(inputNumberList, answerNumberList);
            System.out.println(gameResult.getGameResult());
            if (gameResult.isGameWin()) {
                gameResult.setRegame(gameInput.requestRegame());
                break;
            }
        }
    }
}
