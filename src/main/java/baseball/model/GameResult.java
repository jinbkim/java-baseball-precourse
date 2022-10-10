package baseball.model;

import java.util.List;

public class GameResult {

    private int strike = 0;
    private int ball = 0;

    public GameResult(List<Integer> answerNumber, List<Integer> playerNumber) {
        for (int i = 0; i < playerNumber.size(); i++) {
            if (answerNumber.indexOf(playerNumber.get(i)) == i) {
                strike += 1;
            }
            else if (answerNumber.contains(playerNumber.get(i))) {
                ball += 1;
            }
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
