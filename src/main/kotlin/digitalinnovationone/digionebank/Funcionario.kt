package digitalinnovationone.digionebank

abstract class Funcionario(
    nome: String,
    cpf: CPF,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxílio: ${calculoAuxilio()}
    """.trimIndent()
}