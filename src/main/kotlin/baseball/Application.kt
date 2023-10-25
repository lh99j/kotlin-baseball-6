package baseball

import baseball.Model.Computer
import baseball.View.InputView
import baseball.View.OutputView

fun main() {
    val computer = Computer()
    val inputView = InputView()
    val outputView = OutputView()
    outputView.printStartMessage()
    inputView.inputUserNumber()
}
