package digitalinnovationone.digionebank.testes

import digitalinnovationone.digionebank.CPF
import digitalinnovationone.digionebank.Gerente

fun main() {
    val maria = Gerente(nome = "Maria Eduarda",cpf = CPF("000.000.000-00"), salario = 4000.0, senha = "senha123")
    ImprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autentica(maria)
}