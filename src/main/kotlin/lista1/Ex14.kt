package lista1

fun main() {
    println("Digite o primeiro numero: ")
    val numero1 = readln().toInt()

    println("Digite o primeiro numero: ")
    val numero2 = readln().toInt()

    var divisao = 0
    if (numero2 != 0){
        divisao = numero1 / numero2
        println("O quociente do primeiro numero pelo segundo é: $divisao")
    }else{
        println("Divisão por zero")
    }
}