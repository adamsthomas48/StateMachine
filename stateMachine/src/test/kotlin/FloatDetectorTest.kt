import Float.FloatDetector
import Float.ValidFloatState
import Integer.IntegerDetector
import Integer.ValidIntegerState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FloatDetectorTest {

    val detector = FloatDetector()


    @Test
    fun getState() {
        // assert the type of the detector.state is IntegerStartState
        assertEquals(detector.state.isAccepting, false)

    }

    @Test
    fun setState() {
        detector.state = ValidFloatState(detector)
        assertEquals(detector.state.isAccepting, true)
    }

    @Test
    fun resetState() {
        detector.resetState()
        assertEquals(detector.state.isAccepting, false)
    }
}