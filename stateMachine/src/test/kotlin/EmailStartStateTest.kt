import Email.EmailDetector
import Email.EmailStartState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EmailStartStateTest {
    val emailDetector = EmailDetector()
    val state = EmailStartState(emailDetector)

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