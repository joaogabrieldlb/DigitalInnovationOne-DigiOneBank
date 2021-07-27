package digitalinnovationone.digionebank.testes

import digitalinnovationone.digionebank.CPF
import digitalinnovationone.digionebank.Cliente
import digitalinnovationone.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = CPF("000.000.000-00"),
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)
    TesteAutenticacao().autentica(jose)
}