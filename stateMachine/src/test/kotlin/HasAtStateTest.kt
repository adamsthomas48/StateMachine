import Email.EmailDetector
import Email.HasAtState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HasAtStateTest {

    val emailDetector = EmailDetector()
    val state = HasAtState(emailDetector)

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