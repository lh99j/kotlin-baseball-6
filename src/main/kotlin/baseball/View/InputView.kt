package baseball.View

import baseball.Util.Validator.validateLength
import camp.nextstep.edu.missionutils.Console

class InputView {
    fun inputUserNumber(): String{
        val userInput = Console.readLine()
        validateLength(userInput)
        return userInput
    }
}