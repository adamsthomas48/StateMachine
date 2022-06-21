import Float.FirstZeroState
import Float.FloatDetector
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FirstZeroStateTest {
    val detector = FloatDetector()
    val firstZeroState = FirstZeroState(detector)

    @Test
    fun isAccepting() {
        assertFalse(firstZeroState.isAccepting)
    }

    @Test
    fun consumeInput() {
        detector.state = firstZeroState
        detector.state.consumeInput("2")
        assertFalse(detector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(detector, firstZeroState.detector)
    }
}