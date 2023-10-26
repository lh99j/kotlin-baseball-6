package baseball.Controller

import baseball.Model.BaseBall
import baseball.Model.Computer
import baseball.Util.Constants.RESTART
import baseball.View.InputView
import baseball.View.OutputView

class BaseBallController(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    private var computer = Computer()

    fun run() {
        gameInit()
        gameStart()
    }

    private fun gameInit() {
        outputView.printStartMessage()
    }

    private fun gameStart() {
        val baseBall = BaseBall()

        computer.setComputerNumber()

        while (baseBall.status) {
            println(computer.computerNumber.toList().toString())
            val user = userInput()
            baseBall.compareStrikeAndBall(computer.computerNumber, user)
            outputView.printHint(baseBall)
            baseBall.checkGameStatus()
        }
        gameEnd()
    }

    private fun gameEnd() {
        outputView.printEndMessage()
        val userInput = inputView.inputGameStatus()
        if (userInput == RESTART) {
            gameStart()
        }
    }

    private fun userInput(): List<Int> {
        outputView.printInputMessage()
        return inputView.inputUserNumber()
    }
}