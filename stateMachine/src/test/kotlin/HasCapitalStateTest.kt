import Password.HasBothState
import Password.HasCapitalState
import Password.PasswordDetector
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HasCapitalStateTest {

    val passwordDetector = PasswordDetector()
    val state = HasCapitalState(passwordDetector)

    @Test
    fun isAccepting() {
        assertFalse(state.isAccepting)
    }

    @Test
    fun consumeInput() {
        state.consumeInput("#")
        assertFalse(passwordDetector.state.isAccepting)
    }

    @Test
    fun getDetector() {
        assertEquals(passwordDetector, state.detector)
    }
}