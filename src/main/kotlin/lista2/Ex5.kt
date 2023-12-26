package lista2

fun main() {
    print("Digite quantos alunos são: ")
    val quantidade =  readln().toInt()
    var somaIdades = 0

    for(i in 0..< quantidade){
        print("Digite a idade do aluno ${i + 1}: ")
        val idades = readln().toInt()
        somaIdades += idades
    }
    val media = somaIdades.toDouble() / quantidade
    println("A média é: $media")
}