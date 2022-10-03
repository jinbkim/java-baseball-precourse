package baseball;

import baseball.controller.GamePlay;

public class Application {

    public static void main(String[] args) {
        GamePlay gamePlay = new GamePlay();
        gamePlay.start();
    }
}
