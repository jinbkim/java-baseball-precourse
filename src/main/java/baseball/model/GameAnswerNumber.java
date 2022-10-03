package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GameAnswerNumber {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;

    private List<Integer> answerNumberList;

    public GameAnswerNumber() {
        setAnswerNumberList();
    }

    public Integer getAnswerNumberByIndex(int index) {
        return answerNumberList.get(index);
    }

    public void setAnswerNumberList() {
        Set<Integer> answerNumberSet = new HashSet<>();

        while (answerNumberSet.size() < 3) {
            answerNumberSet.add(getRandomNumber());
        }

        answerNumberList = answerNumberSet.stream()
            .collect(Collectors.toList());
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }


}
