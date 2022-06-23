package Email

import Detector
import State

class PartOneState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string == "@"){
            detector.state = HasAtState(detector)
        }
    }
}