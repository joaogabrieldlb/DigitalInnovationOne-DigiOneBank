package digitalinnovationone.digionebank.testes

import digitalinnovationone.digionebank.Pessoa
import digitalinnovationone.digionebank.CPF

fun main() {
    val joao = Pessoa("João Gabriel",CPF("000.000.000-00"))
    println(joao.pessoaInfo())
}