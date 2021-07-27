package digitalinnovationone.digionebank.testes

import digitalinnovationone.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} = $it")
    }
}