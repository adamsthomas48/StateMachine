import Integer.IntegerDetector
import Integer.IntegerStartState
import Integer.ValidIntegerState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IntegerDetectorTest {
    val detector = IntegerDetector()


    @Test
    fun getState() {
        // assert the type of the detector.state is IntegerStartState
        assertEquals(detector.state.isAccepting, false)

    }

    @Test
    fun setState() {
        detector.state = ValidIntegerState(detector)
        assertEquals(detector.state.isAccepting, true)
    }

    @Test
    fun resetState() {
        detector.resetState()
        assertEquals(detector.state.isAccepting, false)
    }

    @Test
    fun detect() {
        assertTrue(detector.detect("1234"))
        assertTrue(detector.detect("1"))
        assertTrue(detector.detect("111110000"))
        assertFalse(detector.detect("0123"))
        assertFalse(detector.detect("123.32"))
        assertFalse(detector.detect("asdfa"))
        assertFalse(detector.detect("0"))

    }
}