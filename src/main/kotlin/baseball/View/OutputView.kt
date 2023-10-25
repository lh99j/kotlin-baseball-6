package baseball.View

import baseball.Model.BaseBall
import baseball.Util.Constants.BALL
import baseball.Util.Constants.NOTHING
import baseball.Util.Constants.STRIKE

class OutputView {
    fun printStartMessage() {
        println("숫자 야구 게임을 시작합니다.")
    }

    fun printHint(baseBall: BaseBall) {
        val ball = baseBall.ball
        val strike = baseBall.strike
        val result = when {
            ball == 0 && strike == 0 -> NOTHING
            ball > 0 && strike == 0 -> "$ball$BALL"
            ball == 0 && strike > 0 -> "$strike$STRIKE"
            else -> "$ball$BALL $strike$STRIKE"
        }

        println(result)
    }

    fun printInputMessage() {
        print("숫자를 입력해주세요 : ")
    }

    fun printEndMessage() {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
    }
}