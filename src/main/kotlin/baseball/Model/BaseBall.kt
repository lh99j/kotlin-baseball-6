package baseball.Model

import baseball.Util.Constants.SIZE

class BaseBall {
    var strike = 0
    var ball = 0
    var status = true

    fun compareStrikeAndBall(computer: MutableList<Int>, user: List<Int>) {
        initCount()
        for (i in 0 until SIZE) {
            isStrike(i, computer, user)
            isBall(i, computer, user)
        }
    }

    fun checkGameStatus() {
        if (strike == SIZE) {
            status = false
        }
    }

    private fun initCount() {
        strike = 0
        ball = 0
    }

    private fun plusBallCount() {
        ball += 1
    }

    private fun plusStrikeCount() {
        strike += 1
    }

    private fun isBall(idx: Int, computer: MutableList<Int>, user: List<Int>) {
        if (computer[idx] != user[idx] && computer.contains(user[idx])) {
            plusBallCount()
        }
    }

    private fun isStrike(idx: Int, computer: MutableList<Int>, user: List<Int>) {
        if (computer[idx] == user[idx]) {
            plusStrikeCount()
        }
    }
}