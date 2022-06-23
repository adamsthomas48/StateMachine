package Password

import Detector
import State

class HasSpecialState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string !in detector.special){
            detector.state = ValidPasswordState(detector)
        }
    }
}