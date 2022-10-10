package baseball.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GameResultTest {

    private static List<Integer> answerNumber;

    @BeforeAll()
    static void init() {
        answerNumber = Arrays.asList(1, 2, 3);
    }

    @Test
    void 숫자_야구_결과_확인_3스트라이크() {
        List<Integer> playerNumber = new ArrayList<>();
        playerNumber.add(1);
        playerNumber.add(2);
        playerNumber.add(3);
        GameResult gameResult = new GameResult(answerNumber, playerNumber);
        Assertions.assertThat(gameResult.getStrike())
            .isEqualTo(3);
        Assertions.assertThat(gameResult.getBall())
            .isEqualTo(0);
    }

    @Test
    void 숫자_야구_결과_확인_1볼() {
        List<Integer> playerNumber = new ArrayList<>();
        playerNumber.add(3);
        playerNumber.add(4);
        playerNumber.add(5);
        GameResult gameResult = new GameResult(answerNumber, playerNumber);
        Assertions.assertThat(gameResult.getStrike())
            .isEqualTo(0);
        Assertions.assertThat(gameResult.getBall())
            .isEqualTo(1);
    }

    @Test
    void 숫자_야구_결과_확인_낫싱() {
        List<Integer> playerNumber = new ArrayList<>();
        playerNumber.add(4);
        playerNumber.add(5);
        playerNumber.add(6);
        GameResult gameResult = new GameResult(answerNumber, playerNumber);
        Assertions.assertThat(gameResult.getStrike())
            .isEqualTo(0);
        Assertions.assertThat(gameResult.getBall())
            .isEqualTo(0);
    }

    @Test
    void 숫자_야구_결과_확인_1스트라이크_1볼() {
        List<Integer> playerNumber = new ArrayList<>();
        playerNumber.add(4);
        playerNumber.add(2);
        playerNumber.add(1);
        GameResult gameResult = new GameResult(answerNumber, playerNumber);
        Assertions.assertThat(gameResult.getStrike())
            .isEqualTo(1);
        Assertions.assertThat(gameResult.getBall())
            .isEqualTo(1);
    }
}