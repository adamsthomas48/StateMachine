package Integer

import Detector
import InvalidState
import State

class IntegerStartState(override val detector: Detector): State(detector) {

    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "123456789") {
            detector.state = ValidIntegerState(detector)
        } else {
            detector.state = InvalidState(detector)
        }
    }
}