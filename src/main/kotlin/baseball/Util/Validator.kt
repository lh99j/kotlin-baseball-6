package baseball.Util

object Validator {
    fun validateLength(number: String) {
        val userInput = number.toSet()
        if (userInput.size != 3) {
            throw IllegalArgumentException("3자리의 입력이 아닙니다.")
        }
    }
}