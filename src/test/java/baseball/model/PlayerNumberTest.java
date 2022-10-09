package baseball.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerNumberTest {

    @Test
    void 숫자_야구_정상적인_입력값_리스트로_변환() {
        PlayerNumber playerNumber = new PlayerNumber("123");
        Assertions.assertThat(playerNumber.isExist(1))
            .isEqualTo(true);
        Assertions.assertThat(playerNumber.isExist(2))
            .isEqualTo(true);
        Assertions.assertThat(playerNumber.isExist(3))
            .isEqualTo(true);
    }
}