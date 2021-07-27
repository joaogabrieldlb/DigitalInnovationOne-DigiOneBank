package digitalinnovationone.digionebank

class Gerente(
    nome: String,
    cpf: CPF,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun calculoAuxilio() = salario * 0.4

    override fun login(): Boolean = "senha123" == senha
}