package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.LinkedList;
import java.util.List;

public class GameAnswer {

    private static final int RANDOM_MIN_NUMBER = 1;
    private static final int RANDOM_MAX_NUMBER = 9;
    private static final int NUMBER_LENGTH = 3;

    private List<Integer> numbers;

    public GameAnswer() {
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers() {
        numbers = new LinkedList<>();
        while (numbers.size() < 3) {
            int number = Randoms.pickNumberInRange(RANDOM_MIN_NUMBER, RANDOM_MAX_NUMBER);
            if (numbers.contains(number))
                continue;
            numbers.add(number);
        }
    }

}
