package baseball.controller;

import baseball.model.GameAnswerNumber;
import baseball.model.GameInputNumber;
import baseball.view.GameInput;

public class GamePlay {

    private static final GameInput gameInput = new GameInput();
    private boolean isGameOver = false;

    public void start() {
        GameInputNumber gameInputNumber = new GameInputNumber();
        GameAnswerNumber gameAnswerNumber = new GameAnswerNumber();

        while (!isGameOver) {
            gameInput.setInput();
            gameInputNumber.setInputNumberList(gameInput.getInput());
            System.out.println("===== input =====");
            System.out.println(gameInputNumber.getGameNumberByIndex(0));
            System.out.println(gameInputNumber.getGameNumberByIndex(1));
            System.out.println(gameInputNumber.getGameNumberByIndex(2));
            System.out.println("===== answer =====");
            System.out.println(gameAnswerNumber.getAnswerNumberByIndex(0));
            System.out.println(gameAnswerNumber.getAnswerNumberByIndex(1));
            System.out.println(gameAnswerNumber.getAnswerNumberByIndex(2));
            return;
        }
    }
}
