package lista1

import kotlin.math.PI

fun main() {
    print("Digite o raio do cilindro: ")
    val raio = readln().toDouble()
    print("Digite a altura do cilindro: ")
    val altura = readln().toDouble()

    val volume = PI *raio * raio *altura
    println("Valor do volume é: $volume ")

    val area = 2 * PI * raio * raio + 2 * PI *raio * altura
    print("O valor da area é: $area ")
}