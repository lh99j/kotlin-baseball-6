package baseball.View

import baseball.Model.BaseBall

class OutputView {
    fun printStartMessage() {
        println("숫자 야구 게임을 시작합니다.")
    }

    fun printHint(baseBall: BaseBall) {
        val ball = baseBall.ball
        val strike = baseBall.strike
        val result = when {
            ball == 0 && strike == 0 -> "낫싱"
            ball > 0 && strike == 0 -> "${ball}볼"
            ball == 0 && strike > 0 -> "${strike}스트라이크"
            else -> "${ball}볼 ${strike}스트라이크"
        }

        println(result)
    }
}