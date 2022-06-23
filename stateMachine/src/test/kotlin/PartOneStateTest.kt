import Email.EmailDetector
import Email.HasAtState
import Email.PartOneState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PartOneStateTest {

    val emailDetector = EmailDetector()
    val state = PartOneState(emailDetector)

    @Test
    fun isAccepting() {
        assertFalse(state.isAccepting)
    }

    @Test
    fun consumeInput() {
        state.consumeInput("@")
        assertFalse(emailDetector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(emailDetector, state.detector)
    }
}