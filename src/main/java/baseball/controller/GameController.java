package baseball.controller;

import baseball.model.AnswerModel;
import baseball.model.InputModel;
import baseball.model.ResultModel;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private InputModel inputModel = new InputModel();
    private AnswerModel answerModel = new AnswerModel();
    private ResultModel resultModel = new ResultModel();
    private boolean isRegame = true;

    public GameController() {
    }

    public void run() {
        isRegame = true;
        while (isRegame) {
            playGame();
        }
    }

    private void playGame() {
        answerModel.setNumbers();
        while (true) {
            String input = inputView.requestNumber();
            inputModel.setNumbers(input);
            resultModel.setGameResult(inputModel.getNumbers(), answerModel.getNumbers());
            System.out.println(resultModel);
            if (resultModel.isGameOver()) {
                outputView.gameOver();
                isRegame = inputView.requestRegame();
                break;
            }
        }
    }
}
