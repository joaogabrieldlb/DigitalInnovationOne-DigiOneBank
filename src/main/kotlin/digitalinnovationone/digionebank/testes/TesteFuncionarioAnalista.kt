package digitalinnovationone.digionebank.testes

import digitalinnovationone.digionebank.Analista
import digitalinnovationone.digionebank.CPF

fun main() {
    val joao = Analista(nome = "João Gabriel",cpf = CPF("000.000.000-00"), salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}