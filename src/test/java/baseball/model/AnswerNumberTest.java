package baseball.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AnswerNumberTest {

    @Test
    void 중복없는_정답_숫자_생성() {
        AnswerNumber answerNumber = new AnswerNumber();

        Assertions.assertThat(answerNumber.getNumbersForTest()
                .stream()
                .distinct()
                .count())
            .isEqualTo(3);
    }
}