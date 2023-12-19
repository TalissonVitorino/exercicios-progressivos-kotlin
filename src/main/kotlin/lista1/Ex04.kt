package lista1

fun main() {
    print("Digite um numero: ")
    val x = readln().toInt()

    print("Digite um numero: ")
    val y = readln().toInt()

    var quociente = x / y
    var restoDivisao = x - quociente * y

    println(quociente)
    print(restoDivisao)
}