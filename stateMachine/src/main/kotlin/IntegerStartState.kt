class IntegerStartState(override val detector: IntegerDetector): State(detector) {

    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "123456789") {
            detector.state = ValidIntegerState(detector)
        } else {
            detector.state = InvalidState(detector)
        }
    }
}