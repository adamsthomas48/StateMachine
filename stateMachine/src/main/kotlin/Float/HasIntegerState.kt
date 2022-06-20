package Float

import Detector
import InvalidState
import State

class HasIntegerState(override val detector: Detector): State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        when (string) {
            in "0123456789" -> {
                //No-op
            }
            "." -> {
                detector.state = HasDecimalState(detector)
            }
            else -> {
                detector.state = InvalidState(detector)
            }
        }
    }
}