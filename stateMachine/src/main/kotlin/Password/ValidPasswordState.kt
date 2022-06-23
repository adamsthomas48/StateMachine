package Password

import Detector
import State

class ValidPasswordState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if(string in detector.special){
            detector.state = HasBothState(detector)
        }
    }
}