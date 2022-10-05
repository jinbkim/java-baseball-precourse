package baseball;

import baseball.model.GameMachine;

public class Application {

    public static void main(String[] args) {
        GameMachine gameMachine = new GameMachine();
        gameMachine.run();
    }
}
