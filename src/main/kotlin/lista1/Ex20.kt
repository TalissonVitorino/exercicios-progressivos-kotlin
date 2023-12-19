package lista1

fun main() {
    println("Digite o ano para ser verificado: ")
    val ano = readln().toInt()

    if ((ano % 400) == 0 || ((ano % 4) == 0 && (ano % 100) != 0)){
        println("Ano bissexto. ")
    }else{
        println("Ano não bissexto. ")
    }
}