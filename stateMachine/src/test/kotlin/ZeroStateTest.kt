import Binary.BinaryDetector
import Binary.OneState
import Binary.ZeroState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ZeroStateTest {

    val detector = BinaryDetector()
    val state = ZeroState(detector)

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