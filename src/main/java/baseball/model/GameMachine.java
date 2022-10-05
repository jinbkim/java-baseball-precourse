package baseball.model;

import baseball.view.GameInputString;

public class GameMachine {

    private static final GameInputString gameInputString = new GameInputString();
    private static final GameInput gameInput = new GameInput();

    public GameMachine() {
    }

    public void run() {
        String input = gameInputString.requestNumber();
        gameInput.setNumbers(input);
    }
}
