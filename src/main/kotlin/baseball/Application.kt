package baseball

import baseball.Model.Computer
import baseball.View.InputView

fun main() {
    val computer = Computer()
    val inputView = InputView()
    inputView.inputUserNumber()
}
