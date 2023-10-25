package baseball.Util

enum class ExceptionMessage(private val message: String) {
    INVALID_LENGTH("사용자의 입력이 3자리가 아닙니다."),
    INVALID_DISTINCTION("사용자의 입력 중 중복된 수가 존재합니다."),
    INVALID_NUMBER("사용자의 입력이 1부터 9까지의 숫자가 아닙니다.");

    fun getErrorMessage(): String {
        return message
    }
}