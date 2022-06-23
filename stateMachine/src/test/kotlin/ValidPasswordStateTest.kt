import Password.HasBothState
import Password.PasswordDetector
import Password.ValidPasswordState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ValidPasswordStateTest {

    val passwordDetector = PasswordDetector()
    val state = ValidPasswordState(passwordDetector)

    @Test
    fun isAccepting() {
        assertTrue(state.isAccepting)
    }

    @Test
    fun consumeInput() {
        state.consumeInput("j")
        assertFalse(passwordDetector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(passwordDetector, state.detector)
    }
}