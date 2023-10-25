package baseball.Model

import baseball.Util.Constants.SIZE

class BaseBall(private val computer: MutableList<Int>, private val user: List<Int>) {
    var strike = 0
    var ball = 0

    fun compareStrikeAndBall() {
        for (i in 0 until SIZE) {
            if (computer[i] == user[i]) {
                strike++
            } else if (computer.contains(user[i])) {
                ball++
            }
        }
    }
}