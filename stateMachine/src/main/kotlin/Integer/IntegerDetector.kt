package Integer

import Detector
import State

class IntegerDetector: Detector() {
    override var state: State = IntegerStartState(this)

    override fun resetState() {
        state = IntegerStartState(this)
    }
}