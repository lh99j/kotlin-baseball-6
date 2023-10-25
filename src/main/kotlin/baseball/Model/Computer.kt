package baseball.Model

import baseball.Util.Constants.END_NUMBER
import baseball.Util.Constants.SIZE
import baseball.Util.Constants.START_NUMBER
import camp.nextstep.edu.missionutils.Randoms

class Computer() {
    private var _computerNumber = mutableListOf<Int>()

    val computerNumber: MutableList<Int>
        get() = _computerNumber

    init {
        _computerNumber = setComputerNumber()
    }

    private fun setComputerNumber(): MutableList<Int> {
        val computer = mutableListOf<Int>()
        while (computer.size < SIZE) {
            val randomNumber = Randoms.pickNumberInRange(START_NUMBER, END_NUMBER)
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber)
            }
        }
        return computer
    }
}