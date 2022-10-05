package baseball.model;

import java.util.List;

public class GameResult {

    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String NOTHING = "낫싱";
    private static final String GAME_OVER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    private static final long NUMBER_OF_BALLS = 3;

    private long strikeCount = 0;
    private long ballCount = 0;
    private boolean regame = true;

    public GameResult() {
    }

    public String getGameResult() {
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
        if (isGameWin()) {
            stringBuilder.append("\n" + GAME_OVER);
        }
        return stringBuilder.toString();
    }

    public boolean isGameWin() {
        if (strikeCount == NUMBER_OF_BALLS) {
            return true;
        }
        return false;
    }

    public void setGameResult(List<Integer> input, List<Integer> answer) {
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
