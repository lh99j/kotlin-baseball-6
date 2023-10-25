package baseball.Model

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
        while (computer.size < 3) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber)
            }
        }
        return computer
    }
}