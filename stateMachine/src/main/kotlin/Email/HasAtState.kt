package Email

import Detector
import InvalidState
import State

class HasAtState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string in "@."){
            detector.state = InvalidState(detector)
        }
        else {
            detector.state = PartTwoState(detector)
        }
    }
}