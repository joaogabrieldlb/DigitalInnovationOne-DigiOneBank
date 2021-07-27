package digitalinnovationone.digionebank

class Pessoa(
    private var cpf: CPF,
    private var nome: String
) {

    fun pessoaInfo() = "$nome e $cpf"

}