package digitalinnovationone.digionebank

open class Pessoa(
    open val nome: String,
    open val cpf: CPF
) {
    fun pessoaInfo() = "$nome - $cpf"
}