class IntegerDetector: Detector() {
    override var state: State = IntegerStartState(this)
}