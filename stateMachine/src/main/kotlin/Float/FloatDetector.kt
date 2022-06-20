package Float

import Detector
import IntegerStartState
import State

class FloatDetector(): Detector() {
    override var state: State = FloatStartState(this)
}