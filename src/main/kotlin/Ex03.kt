fun main() {

    print("Há quantos anos que você fuma? ")
    val numeroAnos = readln().toDouble()

    print("Quantos cigarros por dia você costuma fumar? ")
    val cigarrosPorDia = readln().toDouble()

    print("Qual é o valor da carteira de cigarro? ")
    val valorCarteira = readln().toDouble()

    val somaDosGastos = numeroAnos * 365 * cigarrosPorDia / 20 * valorCarteira
    println("Total dos gastos é: $somaDosGastos")
}