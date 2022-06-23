package Email

import Detector
import InvalidState
import State

class EmailStartState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string == "@"){
            detector.state = InvalidState(detector)
        }
        else {
            detector.state = PartOneState(detector)
        }
    }
}