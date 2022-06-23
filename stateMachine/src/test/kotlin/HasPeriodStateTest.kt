import Email.EmailDetector
import Email.HasAtState
import Email.HasPeriodState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HasPeriodStateTest {

    val emailDetector = EmailDetector()
    val state = HasPeriodState(emailDetector)

    @Test
    fun isAccepting() {
        assertFalse(state.isAccepting)
    }

    @Test
    fun consumeInput() {
        state.consumeInput("F")
        assertTrue(emailDetector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(emailDetector, state.detector)
    }
}