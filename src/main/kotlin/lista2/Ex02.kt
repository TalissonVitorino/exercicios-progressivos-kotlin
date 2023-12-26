package lista2
fun main() {
    println("Imprimir os multiplos de: ")
    val multiplicacao = readln().toInt()

    println("menores ou iguais a: ")
    val limitador = readln().toInt()
    for (cont in multiplicacao.. limitador step multiplicacao ){
        println(""+ cont)
    }
}
