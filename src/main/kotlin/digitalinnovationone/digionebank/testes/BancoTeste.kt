package digitalinnovationone.digionebank.testes

import digitalinnovationone.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)
    val banco2 = digiOneBank.copy(nome = "Banco2", numero = 12)

    println(digiOneBank.info())
    println(banco2.info())

}