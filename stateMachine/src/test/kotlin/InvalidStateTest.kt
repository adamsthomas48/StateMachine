import Integer.IntegerDetector
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class InvalidStateTest {
    val detector = IntegerDetector()
    private val invalidState = InvalidState(detector)


    @Test
    fun isAccepting() {
        assertFalse(invalidState.isAccepting)
    }

    @Test
    fun consumeInput() {
        detector.state = invalidState
        assertEquals(false, detector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(detector, invalidState.detector)
    }
}