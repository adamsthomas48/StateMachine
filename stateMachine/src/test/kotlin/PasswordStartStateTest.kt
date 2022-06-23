import Password.HasBothState
import Password.PasswordDetector
import Password.PasswordStartState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PasswordStartStateTest {

    val passwordDetector = PasswordDetector()
    val state = PasswordStartState(passwordDetector)

    @Test
    fun isAccepting() {
        assertFalse(state.isAccepting)
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