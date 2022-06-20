package Float

import Detector
import InvalidState
import State

class FloatStartState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string in "123456789"){
            detector.state = HasIntegerState(detector)
        }
        else {
            detector.state = InvalidState(detector)
        }
    }
}