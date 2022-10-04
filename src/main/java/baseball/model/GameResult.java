package baseball.model;

import java.util.List;

public class GameResult {

    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String NOTHING = "낫씽";

    private static final long NUMBER_OF_BALLS = 3;

    private long strikeCount = 0;
    private long ballCount = 0;
    private boolean regame = true;

    public GameResult() {
    }

    public String getGameResult() {
        StringBuilder stringBuilder = new StringBuilder();
        if (strikeCount == 0 && ballCount == 0) {
            return NOTHING;
        }
        if (ballCount > 0) {
            stringBuilder.append(ballCount)
                .append(BALL)
                .append(" ");
        }
        if (strikeCount > 0) {
            stringBuilder.append(strikeCount)
                .append(STRIKE);
        }
        return stringBuilder.toString();
    }

    public boolean isGameWin() {
        if (strikeCount == NUMBER_OF_BALLS) {
            return true;
        }
        return false;
    }

    public void setGameResult(GameInputNumber gameInputNumber, GameAnswerNumber gameAnswerNumber) {
        List<Integer> input = gameInputNumber.getInputNumberList();
        List<Integer> answer = gameAnswerNumber.getAnswerNumberList();
        strikeCount = input.stream()
            .filter(n -> input.indexOf(n) == answer.indexOf(n))
            .count();
        ballCount = input.stream()
            .filter(n -> answer.contains(n) && input.indexOf(n) != answer.indexOf(n))
            .count();
    }

    public boolean isRegame() {
        return regame;
    }

    public void setRegame(boolean regame) {
        this.regame = regame;
    }
}
