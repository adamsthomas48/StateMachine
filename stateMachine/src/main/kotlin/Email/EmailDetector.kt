package Email

import Binary.BinaryStartState
import Detector
import State

class EmailDetector: Detector() {
    override var state: State = EmailStartState(this)

    override fun resetState(){
        state = EmailStartState(this)
    }
}