package baseball.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InputValidatorTest {

    @Test
    void 숫자_야구_비정상적인_입력_받기() {
        InputValidator inputValidator = new InputValidator();

        Assertions.assertThatThrownBy(() -> inputValidator.validatePlayerNumber("1234"));
        Assertions.assertThatThrownBy(() -> inputValidator.validatePlayerNumber("a12"));
        Assertions.assertThatThrownBy(() -> inputValidator.validatePlayerNumber("120"));
        Assertions.assertThatThrownBy(() -> inputValidator.validatePlayerNumber("121"));
    }
}