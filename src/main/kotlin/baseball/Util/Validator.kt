package baseball.Util

object Validator {
    fun validateLength(number: String) {
        val userInput = number.toSet()
        if (userInput.size != 3) {
            throw IllegalArgumentException("3자리의 입력이 아닙니다.")
        }
    }

    fun validateNumber(number: String) {
        val regex = Regex("[1-9]{3}")
        if (!regex.matches(number)) {
            throw IllegalArgumentException("사용자의 입력이 1부터 9까지의 숫자가 아닙니다.")
        }
    }
}