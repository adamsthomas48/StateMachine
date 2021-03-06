abstract class Detector {
    abstract var state: State
    val special: String = "!@#$%&*\\"

    open fun detect(input: String): Boolean {
        val characters = input
            .trim()
            .split("")
            .drop(1)
            .dropLast(1)
            .toMutableList()

        for (character in characters) {
            state.consumeInput(character)
            //println("$character $state")
        }
        val isAccepting = state.isAccepting
        resetState()
        return isAccepting
    }

    abstract fun resetState()

}