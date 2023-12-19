package lista2

fun main() {
    println("Digite um numero de 1 á 100:")
    val numero = readln().toInt()
    var soma = 0
    var contador = 0

    while (contador <= numero) {
        soma += contador
        contador++
    }
    println("A soma dos números inteiros é: $soma ")

    soma = 0
    for (cont in 0..numero) {
        soma += contador
    }
    println("A soma dos números inteiros é: $soma ")
}
