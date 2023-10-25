package baseball.Util

object Validator {
    fun validateLength(number: String) {
        if (number.length != 3) {
            throw IllegalArgumentException(ExceptionMessage.INVALID_LENGTH.getErrorMessage())
        }
    }

    fun validateDistinct(number: String) {
        val userInput = number.toSet()
        if (userInput.size != 3) {
            throw IllegalArgumentException(ExceptionMessage.INVALID_DISTINCTION.getErrorMessage())
        }
    }

    fun validateNumber(number: String) {
        val regex = Regex("[1-9]{3}")
        if (!regex.matches(number)) {
            throw IllegalArgumentException(ExceptionMessage.INVALID_NUMBER.getErrorMessage())
        }
    }
}