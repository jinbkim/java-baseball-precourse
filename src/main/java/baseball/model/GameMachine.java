package baseball.model;

import baseball.view.GameInputString;

public class GameMachine {

    private static final GameInputString gameInputString = new GameInputString();
    private static final GameInput gameInput = new GameInput();
    private static final GameAnswer gameAnswer = new GameAnswer();

    public GameMachine() {
    }

    public void run() {
        gameAnswer.setNumbers();
        String input = gameInputString.requestNumber();
        gameInput.setNumbers(input);

        System.out.println(gameAnswer.getNumbers());
    }
}
