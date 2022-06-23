package Email

import Detector
import InvalidState
import State

class PartTwoState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string == "."){
            detector.state = HasPeriodState(detector)
        }
        else if(string == "@"){
            detector.state = InvalidState(detector)
        }
    }
}