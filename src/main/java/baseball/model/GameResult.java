package baseball.model;

import baseball.view.OutputView;
import java.util.List;

public class GameResult {

    private int strike = 0;
    private int ball = 0;

    public GameResult(List<Integer> answerNumber, List<Integer> playerNumber) {
        strike = (int) playerNumber.stream()
            .filter(n -> playerNumber.indexOf(n) == answerNumber.indexOf(n))
            .count();
        ball = (int) playerNumber.stream()
            .filter(n -> answerNumber.contains(n) && playerNumber.indexOf(n) != answerNumber.indexOf(n))
            .count();
        printGameResult();
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
        if (ball == 0 && strike == 0) {
            stringBuilder.append(OutputView.NOTHING);
        }
        System.out.println(stringBuilder);
    }

    public boolean isGameWin() {
        return strike == 3;
    }
}
