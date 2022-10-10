package baseball.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InputValidatorTest {

    InputValidator inputValidator = new InputValidator();


    @Test
    void 숫자_야구_정상적인_입력_받기() {
        Assertions.assertThatCode(() -> inputValidator.validatePlayerNumber("123"))
            .doesNotThrowAnyException();
    }

    @Test
    void 숫자_야구_비정상적인_입력_받기() {
        Assertions.assertThatThrownBy(() -> inputValidator.validatePlayerNumber("1234"));
        Assertions.assertThatThrownBy(() -> inputValidator.validatePlayerNumber("a12"));
        Assertions.assertThatThrownBy(() -> inputValidator.validatePlayerNumber("120"));
        Assertions.assertThatThrownBy(() -> inputValidator.validatePlayerNumber("121"));
    }

    @Test
    void 다시_게임을_시작할지_정상적인_입력_받기() {
        Assertions.assertThatCode(() -> inputValidator.validateIsRegame("1"))
            .doesNotThrowAnyException();
        Assertions.assertThatCode(() -> inputValidator.validateIsRegame("2"))
            .doesNotThrowAnyException();
    }

    @Test
    void 다시_게임을_시작할지_비정상적인_입력_받기() {
        Assertions.assertThatThrownBy(() -> inputValidator.validateIsRegame("0"));
        Assertions.assertThatThrownBy(() -> inputValidator.validateIsRegame("3"));
        Assertions.assertThatThrownBy(() -> inputValidator.validateIsRegame("a"));
    }
}