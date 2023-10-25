package baseball.View

import baseball.Util.Validator.validateDuplication
import baseball.Util.Validator.validateNumber
import camp.nextstep.edu.missionutils.Console

class InputView {
    fun inputUserNumber(): String{
        val userInput = Console.readLine()
        validateDuplication(userInput)
        validateNumber(userInput)
        return userInput
    }
}