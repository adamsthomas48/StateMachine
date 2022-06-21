package Binary

import Detector
import Float.FloatStartState
import State

class BinaryDetector: Detector() {
    override var state: State = BinaryStartState(this)

    override fun resetState(){
        state = BinaryStartState(this)
    }
}