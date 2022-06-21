import Integer.IntegerDetector
import Integer.IntegerStartState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IntegerStartStateTest {
    val detector = IntegerDetector()
    val startState = IntegerStartState(detector)
    @Test
    fun isAccepting() {
        assertFalse(startState.isAccepting)
    }

    @Test
    fun consumeInput() {
        startState.consumeInput("1")
        assertTrue(detector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(detector, startState.detector)
    }
}