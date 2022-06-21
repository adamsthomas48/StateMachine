package Binary

import Detector
import InvalidState
import State

class OneState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if(string == "1"){
            //No-Op
        }
        else if(string == "0"){
            detector.state = ZeroState(detector)
        }
        else{
            detector.state = InvalidState(detector)
        }
    }
}