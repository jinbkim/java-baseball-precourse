package baseball.model;

import baseball.view.OutputView;
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

    public void printGameResult() {
        StringBuilder stringBuilder = new StringBuilder();

        if (ball > 0) {
            stringBuilder.append(ball + OutputView.BALL + " ");
        }
        if (strike > 0) {
            stringBuilder.append(strike + OutputView.STRIKE);
        }
        if (isGameWin()) {
            stringBuilder.append("\n" + OutputView.GAME_WIN);
        }
        if (ball == 0 && strike == 0) {
            stringBuilder.append(OutputView.NOTHING);
        }
        System.out.println(stringBuilder);
    }

    public boolean isGameWin() {
        return strike == 3;
    }
}
