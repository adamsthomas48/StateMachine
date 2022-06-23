import Email.EmailDetector
import Email.ValidEmailState
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EmailDetectorTest {
    val emailDetector = EmailDetector()

    @Test
    fun getState() {
        assertEquals(false, emailDetector.state.isAccepting)
    }

    @Test
    fun setState() {
        emailDetector.state = ValidEmailState(emailDetector)
        assertTrue(emailDetector.state.isAccepting)
    }

    @Test
    fun resetState() {
        emailDetector.resetState()
        assertEquals(false, emailDetector.state.isAccepting)
    }

    @Test
    fun detect() {
        assertTrue(emailDetector.detect("adam.thomas.test@gmail.com"))
        assertTrue(emailDetector.detect("asldfjalskdfj...asdfasdf@asdf.com"))
        assertFalse(emailDetector.detect("asdfasdfaf"))
        assertFalse(emailDetector.detect("@sdf"))
        assertFalse(emailDetector.detect("asdfa@asdfasd."))
    }
}