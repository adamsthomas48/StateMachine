package Password

import Detector
import State

class PasswordStartState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string in detector.special){
            detector.state = HasSpecialState(detector)
        }
        else if(string[0].isUpperCase()){
            detector.state = HasCapitalState(detector)
        }

    }
}