package lista1

import java.util.*

fun main() {
    val teclado = Scanner(System.`in`)
    println("Digite um número")
    val numero1 = teclado.nextInt()
    println("Digite um número")
    val numero2 = teclado.nextInt()
    println("Digite um número")
    val numero3 = teclado.nextInt()
    println("Digite um número")
    val numero4 = teclado.nextInt()
    var soma = 0

    if (numero1 % 2 == 0) soma += numero1
    if (numero2 % 2 == 0) soma += numero2
    if (numero3 % 2 == 0) soma += numero3
    if (numero4 % 2 == 0) soma += numero4
    println("O total da soma é: $soma")
}