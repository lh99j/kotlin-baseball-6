package baseball.View

import baseball.Util.Validator.validateDistinct
import baseball.Util.Validator.validateLength
import baseball.Util.Validator.validateNumber
import camp.nextstep.edu.missionutils.Console

class InputView {
    fun inputUserNumber(): List<Int> {
        val userInput = Console.readLine()
        validateLength(userInput)
        validateDistinct(userInput)
        validateNumber(userInput)
        return userInput.map { it.digitToInt() }
    }
}