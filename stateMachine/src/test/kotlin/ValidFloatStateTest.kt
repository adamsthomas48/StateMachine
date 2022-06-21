import Float.FloatDetector
import Float.HasDecimalState
import Float.ValidFloatState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ValidFloatStateTest {

    val detector = FloatDetector()
    val state = ValidFloatState(detector)

    @Test
    fun isAccepting() {
        assertTrue(state.isAccepting)
    }

    @Test
    fun consumeInput() {
        detector.state = state
        detector.state.consumeInput("2")
        assertTrue(detector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(detector, state.detector)
    }
}