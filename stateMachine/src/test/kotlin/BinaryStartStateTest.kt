import Binary.BinaryDetector
import Binary.BinaryStartState
import Float.FloatDetector
import Float.HasDecimalState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BinaryStartStateTest {

    val detector = BinaryDetector()
    val state = BinaryStartState(detector)

    @Test
    fun isAccepting() {
        assertFalse(state.isAccepting)
    }

    @Test
    fun consumeInput() {
        detector.state = state
        detector.state.consumeInput("2")
        assertFalse(detector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(detector, state.detector)
    }
}