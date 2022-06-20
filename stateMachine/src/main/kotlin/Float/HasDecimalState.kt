package Float

import Detector
import InvalidState
import State

class HasDecimalState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string in "0123456789") {
            detector.state = ValidFloatState(detector)
        }
        else {
            detector.state = InvalidState(detector)
        }
    }
}