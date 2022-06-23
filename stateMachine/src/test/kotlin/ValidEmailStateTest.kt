import Email.EmailDetector
import Email.PartTwoState
import Email.ValidEmailState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ValidEmailStateTest {

    val emailDetector = EmailDetector()
    val state = ValidEmailState(emailDetector)

    @Test
    fun isAccepting() {
        assertTrue(state.isAccepting)
    }

    @Test
    fun consumeInput() {

        state.consumeInput(".")
        assertFalse(emailDetector.state.isAccepting)

    }

    @Test
    fun getDetector() {
        assertEquals(emailDetector, state.detector)
    }
}