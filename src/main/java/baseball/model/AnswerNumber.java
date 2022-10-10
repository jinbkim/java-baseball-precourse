package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class AnswerNumber {

    private static final int RANDOM_MIN_NUMBER = 1;
    private static final int RANDOM_MAX_NUMBER = 9;
    private static final int NUMBER_SIZE = 3;

    private List<Integer> numbers;

    public AnswerNumber() {
        numbers = new ArrayList<>();
        while (numbers.size() < NUMBER_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(RANDOM_MIN_NUMBER, RANDOM_MAX_NUMBER);

            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
