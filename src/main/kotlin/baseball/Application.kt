package baseball

import baseball.Controller.BaseBallController
import baseball.Model.Computer
import baseball.View.InputView
import baseball.View.OutputView

fun main() {
    val inputView = InputView()
    val outputView = OutputView()
    val baseBallController = BaseBallController(inputView, outputView)
    baseBallController.gameStart()
}
