import Binary.BinaryDetector
import Binary.BinaryStartState
import Binary.OneState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class OneStateTest {

    val detector = BinaryDetector()
    val state = OneState(detector)

    @Test
    fun isAccepting() {
        assertTrue(state.isAccepting)
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