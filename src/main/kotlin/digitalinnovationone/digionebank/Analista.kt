package digitalinnovationone.digionebank

class Analista(
    nome: String,
    cpf: CPF,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.1

}