package digitalinnovationone.digionebank

abstract class Pessoa(
    val nome: String,
    val cpf: CPF
) {
    fun pessoaInfo() = "$nome - $cpf"
}