package baseball.Model

import baseball.Util.Constants.SIZE

class BaseBall(private val computer: MutableList<Int>, private val user: List<Int>) {
    var strike = 0
    var ball = 0

    fun compareStrikeAndBall() {
        for (i in 0 until SIZE) {
            strike += isStrike(i)
            ball += isBall(i)
        }
    }

    fun isThreeStrike() = strike == SIZE

    private fun isBall(idx: Int): Int {
        if (computer[idx] != user[idx] && computer.contains(user[idx])) {
            return 1
        }
        return 0
    }

    private fun isStrike(idx: Int): Int {
        if (computer[idx] == user[idx]) {
            return 1
        }
        return 0
    }
}