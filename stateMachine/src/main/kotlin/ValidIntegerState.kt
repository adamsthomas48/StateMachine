class ValidIntegerState(override val detector: IntegerDetector): State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string !in "0123456789") {
            detector.state = InvalidState(detector)
        }
    }
}