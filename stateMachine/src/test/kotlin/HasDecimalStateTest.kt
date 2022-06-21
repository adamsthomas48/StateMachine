import Float.FloatDetector
import Float.FloatStartState
import Float.HasDecimalState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HasDecimalStateTest {
    val detector = FloatDetector()
    val state = HasDecimalState(detector)

    @Test
    fun isAccepting() {
        assertFalse(state.isAccepting)
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