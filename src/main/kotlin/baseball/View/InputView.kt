package baseball.View

import baseball.Util.Validator.validateLength
import baseball.Util.Validator.validateNumber
import camp.nextstep.edu.missionutils.Console

class InputView {
    fun inputUserNumber(): String{
        val userInput = Console.readLine()
        validateLength(userInput)
        validateNumber(userInput)
        return userInput
    }
}