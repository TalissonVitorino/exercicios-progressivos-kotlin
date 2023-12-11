fun main() {
    println("Digeite um número")
    val numero1 = readln().toInt()

    println("Digeite um número")
    val numero2 = readln().toInt()

    println("Digeite um número")
    val numero3 = readln().toInt()

    val soma = numero2 + numero3

    if (numero1 > soma) {
        println("Número maior")
    } else {
        println("Número menor")
    }
    //println(if (numero1 > soma) "Número maior" else "Número menor")
}
