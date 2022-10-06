package baseball.model;

import java.util.List;

public class ResultModel {

    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String NOTHING = "낫싱";
    private static final int NUMBER_LENGTH = 3;

    private int strikeCount = 0;
    private int ballCount = 0;

    public ResultModel() {
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (strikeCount == 0 && ballCount == 0) {
            stringBuilder.append(NOTHING);
        }
        if (ballCount > 0) {
            stringBuilder.append(ballCount + BALL + " ");
        }
        if (strikeCount > 0) {
            stringBuilder.append(strikeCount + STRIKE);
        }
        return stringBuilder.toString();
    }


    public void setGameResult(List<Integer> input, List<Integer> answer) {
        strikeCount = (int) input.stream()
            .filter(n -> input.indexOf(n) == answer.indexOf(n))
            .count();
        ballCount = (int) input.stream()
            .filter(n -> answer.contains(n) && input.indexOf(n) != answer.indexOf(n))
            .count();
    }

    public boolean isGameOver() {
        return strikeCount == NUMBER_LENGTH;
    }
}
