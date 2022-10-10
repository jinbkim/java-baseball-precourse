package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class AnswerNumber {

    private static final int RAND_NUM_MIN = 1;
    private static final int RAND_NUM_MAX= 9;
    private static final int NUMBER_SIZE = 3;

    private List<Integer> numbers;

    public AnswerNumber() {
        numbers = new ArrayList<>();
        while (numbers.size() < NUMBER_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(RAND_NUM_MIN, RAND_NUM_MAX);

            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
