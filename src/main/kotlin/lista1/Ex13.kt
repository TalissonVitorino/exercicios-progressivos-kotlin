package lista1

fun main() {
    println("Quanto de latão que você precisa? ")
    val latao = readln().toDouble()
    val cobre = latao * 70 / 100
    val zinco = latao * 30 / 100

    println("Quantidade de cobre é: $cobre ")
    println("Quantidade de zinco é: $zinco ")
}