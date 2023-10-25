package baseball.Controller

import baseball.Model.BaseBall
import baseball.Model.Computer
import baseball.View.InputView
import baseball.View.OutputView

class BaseBallController(private val inputView: InputView, private val outputView: OutputView) {
    fun gameStart() {
        outputView.printStartMessage()
        val computer = Computer()
        val user = inputView.inputUserNumber()
        val hint = BaseBall(computer.computerNumber, user)
        hint.compareStrikeAndBall()
    }
}