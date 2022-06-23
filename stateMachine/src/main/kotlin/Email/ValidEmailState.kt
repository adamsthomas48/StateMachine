package Email

import Detector
import InvalidState
import State

class ValidEmailState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if(string in "@."){
            detector.state = InvalidState(detector)
        }
    }
}