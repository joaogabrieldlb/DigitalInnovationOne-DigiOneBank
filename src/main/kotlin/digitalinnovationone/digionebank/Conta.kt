package digitalinnovationone.digionebank

import java.math.BigDecimal

class Conta(
    private val agencia: String,
    private val numero: String,
    private var saldo: BigDecimal
) {

    fun deposito(valor: BigDecimal) {
        if(valor > BigDecimal(0)) {
            this.saldo.add(valor)
        }
    }

    fun saque(valor: BigDecimal) {
        if(this.saldo >= valor) {
            this.saldo.subtract(valor)
        }
    }

}