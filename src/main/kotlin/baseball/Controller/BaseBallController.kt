package baseball.Controller

import baseball.Model.BaseBall
import baseball.Model.Computer
import baseball.View.InputView
import baseball.View.OutputView

class BaseBallController(private val inputView: InputView, private val outputView: OutputView) {
    private var computer = Computer()
    fun gameStart() {
        outputView.printStartMessage()
        computer.setComputerNumber()
        var gameStatus = true

        while (gameStatus) {
            println(computer.computerNumber.toList().toString())
            val user = userInput()
            val hint = BaseBall(computer.computerNumber, user)
            hint.compareStrikeAndBall()
            outputView.printHint(hint)

            if (hint.isThreeStrike()) {
                outputView.printEndMessage()
                val status = inputView.inputGameStatus()
                if (status == "1") {
                    computer = Computer()
                    continue
                }
                break
            }
        }
    }

    fun userInput(): List<Int> {
        outputView.printInputMessage()
        return inputView.inputUserNumber()
    }
}