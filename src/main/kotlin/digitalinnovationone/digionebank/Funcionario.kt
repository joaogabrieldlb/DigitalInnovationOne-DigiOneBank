package digitalinnovationone.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: CPF,
    val salario: BigDecimal
) : Pessoa(nome, cpf) {
    abstract fun calculoAuxilio(): BigDecimal
}