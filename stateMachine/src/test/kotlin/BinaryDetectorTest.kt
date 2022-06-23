import Binary.BinaryDetector
import Binary.OneState
import Integer.IntegerDetector
import Integer.ValidIntegerState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BinaryDetectorTest {

    val detector = BinaryDetector()


    @Test
    fun getState() {
        // assert the type of the detector.state is IntegerStartState
        assertEquals(detector.state.isAccepting, false)

    }

    @Test
    fun setState() {
        detector.state = OneState(detector)
        assertEquals(detector.state.isAccepting, true)
    }

    @Test
    fun resetState() {
        detector.resetState()
        assertEquals(detector.state.isAccepting, false)
    }

    @Test
    fun detect() {
        assertTrue(detector.detect("1000101"))
        assertTrue(detector.detect("1"))
        assertTrue(detector.detect("101"))
        assertFalse(detector.detect("100010"))
        assertFalse(detector.detect("000101"))
        assertFalse(detector.detect("1234"))
        assertFalse(detector.detect("100a01"))
    }
}