package digitalinnovationone.digionebank

class Gerente(
    nome: String,
    cpf: CPF,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoAuxilio() = salario * 0.4


}