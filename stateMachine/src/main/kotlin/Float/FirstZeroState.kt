package Float

import Detector
import InvalidState
import State

class FirstZeroState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string == "."){
            detector.state = HasDecimalState(detector)
        }
        else {
            detector.state = InvalidState(detector)
        }
    }
}