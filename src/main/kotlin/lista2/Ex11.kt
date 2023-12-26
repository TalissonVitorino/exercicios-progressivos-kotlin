package lista2

fun main() {

    var consta = 0
    var naoConsta = 0
//    for (i in 1..10) {
//        print("Digite um valor: ")
//        val valor = readln().toInt()
//        if (valor in 10..50) {
//            consta += 1
//        } else {
//            naoConsta += 1
//        }
//    }
//    println("Quantidade de números entre 10 e 50: $consta ")
//    println("Quantidade de números que não consta entre 10 e 50: $naoConsta ")

//    consta = 0
//    naoConsta = 0
    repeat(10) {
        print("Digite um valor: ")
        val valor = readln().toInt()
        if (valor in 10..50) {
            consta += 1
        } else {
            naoConsta += 1
        }
    }
    println("Quantidade de números entre 10 e 50: $consta ")
    println("Quantidade de números que não consta entre 10 e 50: $naoConsta ")
}