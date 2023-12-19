package lista1

fun main() {
    print("Digite uma nota: ")
    val numero1 = readln().toDouble()

    print("Digite uma nota: ")
    val numero2 = readln().toDouble()

    print("Digite uma nota: ")
    val numero3 = readln().toDouble()
    val soma = numero1 + numero2 + numero3

    val media = soma / 3
    println(media)

    when {
        media >= 7 -> println("Aprovado")
        media >= 5 -> println("Recuperacao")
        else -> println("Reprovado")
    }
}

//    if (media >= 7) {
//        println("Aprovado")
//    } else {
//        if (media >= 5) {
//            println("Recuperacao")
//        } else
//            println("Reprovado")
//    }

