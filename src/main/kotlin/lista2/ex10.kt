package lista2

fun main() {

    var soma = 0
    var contador = 0
    for (i in 13..73) {

        if (i % 2 == 0) {
            contador = contador + 1
            soma += i
        }
    }
    val media = soma / contador
    println(media)
}