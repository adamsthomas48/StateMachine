package Binary

import Detector
import InvalidState
import State

class BinaryStartState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string == "1"){
            detector.state = OneState(detector)
        }
        else{
            detector.state = InvalidState(detector)
        }
    }
}