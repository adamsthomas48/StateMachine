import Password.PasswordDetector
import Password.ValidPasswordState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PasswordDetectorTest {

    val passwordDetector = PasswordDetector()

    @Test
    fun getState() {
        assertFalse(passwordDetector.state.isAccepting)
    }

    @Test
    fun setState() {
        passwordDetector.state = ValidPasswordState(passwordDetector)
        assertTrue(passwordDetector.state.isAccepting)
    }

    @Test
    fun detect() {
        assertTrue(passwordDetector.detect("AdamIsAwesome#%j"))
        assertFalse(passwordDetector.detect("asdfa"))
        assertFalse(passwordDetector.detect("asldkfjalsdkfjalksdfj"))
        assertFalse(passwordDetector.detect("asdfasdfasdfa%@"))

    }

    @Test
    fun resetState() {
        passwordDetector.resetState()
        assertFalse(passwordDetector.state.isAccepting)
    }
}