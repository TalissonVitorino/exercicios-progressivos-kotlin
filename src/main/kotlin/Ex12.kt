fun main() {

    println("Qual era a velocidade do motorista? ")
    val velocidadeMotorista = readln().toDouble()
    println("Qual era a velocidade maxima da psita? ")
    val velocidadePista = readln().toDouble()
    val excessoVelocidade = velocidadeMotorista - velocidadePista

    when {
        excessoVelocidade <= 0 -> println("Não tem excesso de velocidade (Sem multa )")
        excessoVelocidade <= 10 -> println("Exite um excesso de velocidade de 10% (A multa sera de 50.)")
        excessoVelocidade <= 30 -> println("Exite um excesso de velocidade entre 10% e 30% (A multa será 100.)")
        else -> println("O excesso de velocidade está a cima de 30%(A multa será 200)")
    }
}
