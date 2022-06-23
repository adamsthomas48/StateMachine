import Password.HasBothState
import Password.PasswordDetector
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HasBothStateTest {

    val passwordDetector = PasswordDetector()
    val state = HasBothState(passwordDetector)

    @Test
    fun isAccepting() {
        assertFalse(state.isAccepting)
    }

    @Test
    fun consumeInput() {
        state.consumeInput("j")
        assertTrue(passwordDetector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(passwordDetector, state.detector)
    }
}