/*
tenho qua fazer um while para cria um loop

 */


package lista2

fun main() {
    println("Digite o número fatorial qualquer: ")
    val numero = readln().toInt()

    var produto = 1
    for (i in numero downTo 1) {
        produto *= i
    }
    println(produto)

    var outroProduto = 1
    for (i in 1..numero) {
        outroProduto *= i
    }
    println(outroProduto)


}