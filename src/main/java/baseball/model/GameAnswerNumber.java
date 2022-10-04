package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class GameAnswerNumber {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;

    private List<Integer> answerNumberList;

    public GameAnswerNumber() {
        setAnswerNumberList();
    }

    public List<Integer> getAnswerNumberList() {
        return answerNumberList;
    }

    public void setAnswerNumberList() {
        answerNumberList = new ArrayList<>();
        while (answerNumberList.size() < 3) {
            Integer randomNumber = getRandomNumber();
            if (answerNumberList.contains(randomNumber)) {
                continue;
            }
            answerNumberList.add(randomNumber);
        }
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }


}
