package digitalinnovationone.digionebank

import java.math.BigDecimal

class Funcionario(
    override val nome: String,
    override val cpf: CPF,
    val salario: BigDecimal
) : Pessoa(nome, cpf) {

}