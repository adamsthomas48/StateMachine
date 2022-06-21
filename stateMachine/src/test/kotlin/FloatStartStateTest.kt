import Float.FirstZeroState
import Float.FloatDetector
import Float.FloatStartState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FloatStartStateTest {
    val detector = FloatDetector()
    val floatStartState = FloatStartState(detector)

    @Test
    fun isAccepting() {
        assertFalse(floatStartState.isAccepting)
    }

    @Test
    fun consumeInput() {
        detector.state = floatStartState
        detector.state.consumeInput("2")
        assertFalse(detector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(detector, floatStartState.detector)
    }
}