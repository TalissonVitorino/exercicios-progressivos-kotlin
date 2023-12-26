package lista2

fun main() {
    println("Digite o numero da tabuada: ")

    val tabuadaDe = readln().toInt()
    for (i in 1..10){
        val resultado = tabuadaDe * i
        println("$tabuadaDe * $i = $resultado" )
    }
}