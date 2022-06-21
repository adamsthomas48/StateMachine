package Float

import Detector
import State

class FloatDetector(): Detector() {
    override var state: State = FloatStartState(this)

    override fun resetState(){
        state = FloatStartState(this)
    }
}