import Email.EmailDetector
import Email.HasAtState
import Email.PartTwoState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PartTwoStateTest {

    val emailDetector = EmailDetector()
    val state = PartTwoState(emailDetector)

    @Test
    fun isAccepting() {
        assertFalse(state.isAccepting)
    }

    @Test
    fun consumeInput() {
        state.consumeInput(".")
        assertFalse(emailDetector.state.isAccepting)
        state.consumeInput("@")
        assertFalse(emailDetector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(emailDetector, state.detector)
    }
}