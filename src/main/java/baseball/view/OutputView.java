package baseball.view;

public class OutputView {

    private static final String REQUEST_NUMBER = "숫자를 입력해주세요 : ";
    private static final String GAME_OVER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public OutputView() {
    }

    public void requestNumber() {
        System.out.print(REQUEST_NUMBER);
    }

    public void gameOver() {
        System.out.println(GAME_OVER);
    }
}
