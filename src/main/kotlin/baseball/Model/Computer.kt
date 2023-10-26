package baseball.Model

import baseball.Util.Constants.END_NUMBER
import baseball.Util.Constants.SIZE
import baseball.Util.Constants.START_NUMBER
import camp.nextstep.edu.missionutils.Randoms

class Computer() {
    private var _computerNumber = mutableListOf<Int>()

    val computerNumber: MutableList<Int>
        get() = _computerNumber

    fun setComputerNumber() {
        _computerNumber = mutableListOf<Int>()
        while (_computerNumber.size < SIZE) {
            val randomNumber = Randoms.pickNumberInRange(START_NUMBER, END_NUMBER)
            if (!_computerNumber.contains(randomNumber)) {
                _computerNumber.add(randomNumber)
            }
        }
    }
}