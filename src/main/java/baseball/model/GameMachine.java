package baseball.model;

import baseball.view.GameInputString;
import baseball.view.GameOutputString;

public class GameMachine {

    private static final GameInputString gameInputString = new GameInputString();
    private static final GameOutputString gameOutputString = new GameOutputString();
    private static final GameInput gameInput = new GameInput();
    private static final GameAnswer gameAnswer = new GameAnswer();
    private static final GameResult gameResult = new GameResult();
    private boolean isRegame = true;

    public GameMachine() {
    }

    public void run() {
        isRegame = true;
        while (isRegame) {
            playGame();
        }
    }

    private void playGame() {
        gameAnswer.setNumbers();
        while (true) {
            String input = gameInputString.requestNumber();
            gameInput.setNumbers(input);
            gameResult.setGameResult(gameInput.getNumbers(), gameAnswer.getNumbers());
            System.out.println(gameResult);
            if (gameResult.isGameOver()) {
                gameOutputString.gameOver();
                isRegame = gameInputString.requestRegame();
                break;
            }
        }
    }
}
