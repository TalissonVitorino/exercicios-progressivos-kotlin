package lista1

fun main() {
    println("Digite um numero:")
    val primeiroNumero = readln().toInt()

    println("Digite um numero:")
    val segundoNumero = readln().toInt()

    val soma = primeiroNumero + segundoNumero
    println("Esta é a soma dos valores: $soma ")

    val multiplicacao = primeiroNumero * segundoNumero
    println("Este é o produto: $multiplicacao ")

    val divisao = primeiroNumero/segundoNumero
    println("Este é o quociente: $divisao ")
}