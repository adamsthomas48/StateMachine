import Password.HasBothState
import Password.HasSpecialState
import Password.PasswordDetector
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HasSpecialStateTest {

    val passwordDetector = PasswordDetector()
    val state = HasSpecialState(passwordDetector)

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