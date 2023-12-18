fun main() {
    println("Digite o primeiro número")
    val primeiro = readln().toInt()
    println("Digite o segundo número")
    val segundo = readln().toInt()
    println("Digite o terceiro número")
    val terceiro = readln().toInt()
    var maior = primeiro

    maior = if (primeiro > segundo) {
        if (primeiro > terceiro) {
            primeiro
        } else {
            if (terceiro > segundo) {
                terceiro
            } else {
                segundo
            }
        }
    } else {
        if (segundo > terceiro) {
            segundo
        } else {
            terceiro
        }
    }
    println("O Maior número é: $maior")
}