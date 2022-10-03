package baseball.controller;

import baseball.model.GameNumber;
import baseball.view.GameInput;

public class GamePlay {

    private static final GameInput gameInput = new GameInput();
    private boolean isGameOver = false;

    public void start() {
        GameNumber gameNumber = new GameNumber();

        while (!isGameOver) {
            gameInput.setInput();
            gameNumber.setGameNumberList(gameInput.getInput());
            System.out.println(gameNumber.getGameNumberByIndex(0));
            System.out.println(gameNumber.getGameNumberByIndex(1));
            System.out.println(gameNumber.getGameNumberByIndex(2));
            return;
        }
    }
}
