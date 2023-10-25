package baseball.Util

import baseball.Util.Constants.REGEX
import baseball.Util.Constants.SIZE

object Validator {
    fun validateLength(number: String) {
        if (number.length != SIZE) {
            throw IllegalArgumentException(ExceptionMessage.INVALID_LENGTH.getErrorMessage())
        }
    }

    fun validateDistinct(number: String) {
        val userInput = number.toSet()
        if (userInput.size != SIZE) {
            throw IllegalArgumentException(ExceptionMessage.INVALID_DISTINCTION.getErrorMessage())
        }
    }

    fun validateNumber(number: String) {
        val regex = REGEX.toRegex()
        if (!regex.matches(number)) {
            throw IllegalArgumentException(ExceptionMessage.INVALID_NUMBER.getErrorMessage())
        }
    }

    fun validateStatue(number: String){
        if(number == "1" || number == "2"){
            return
        }

        throw IllegalArgumentException(ExceptionMessage.INVALID_STATUS.getErrorMessage())
    }
}