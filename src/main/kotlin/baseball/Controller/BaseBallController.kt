package baseball.Controller

import baseball.View.InputView
import baseball.View.OutputView

class BaseBallController(private val inputView: InputView, private val outputView: OutputView) {
    fun gameStart() {
        outputView.printStartMessage()
    }
}