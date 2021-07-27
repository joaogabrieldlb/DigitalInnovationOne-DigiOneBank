package digitalinnovationone.digionebank.testes

import digitalinnovationone.digionebank.Pessoa
import digitalinnovationone.digionebank.CPF
import digitalinnovationone.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val joao = Pessoa("João Gabriel",CPF("000.000.000-00"))
    println(joao.pessoaInfo())

    val jether = Funcionario("Jether Rodrigues",CPF("000.000.000-00"), BigDecimal(1500.0))
    println(jether.pessoaInfo())
    println(jether.salario)
}