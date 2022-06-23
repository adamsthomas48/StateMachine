package Password

import Detector
import Email.EmailStartState
import State

class PasswordDetector: Detector() {

    override var state: State = PasswordStartState(this)

    override fun detect(input: String): Boolean{

        if(input.length < 8){
            return false
        }
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

    override fun resetState(){
        state = PasswordStartState(this)
    }

}