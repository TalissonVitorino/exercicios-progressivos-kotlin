package lista1

fun main() {
    val precoDeCusto = lerPrecoDeCusto()
    val imposto = calculaImposto(precoDeCusto)
    val lucroDestribuidor = calculaLucroDistribuidor(precoDeCusto)
    val precoFinal = calculaPrecoFinal(precoDeCusto, imposto, lucroDestribuidor)
    imprimeValores(lucroDestribuidor, imposto, precoFinal)
}

fun imprimeValores(lucroDestribuidor: Double, imposto: Double, precoFinal: Double) {
    println("Lucro do distribuidor é de: $lucroDestribuidor")
    println("Imposto é de: $imposto")
    println("Preço final: $precoFinal")
}

fun calculaPrecoFinal(precoDeCusto: Double, imposto: Double, lucroDestribuidor: Double): Double =
    precoDeCusto + imposto + lucroDestribuidor

fun calculaLucroDistribuidor(precoDeCusto: Double): Double = precoDeCusto * 12 / 100

fun calculaImposto(valor: Double): Double = valor * 45 / 100

fun lerPrecoDeCusto(): Double {
    print("Informe o preço de custo do veiculo: ")
    return readln().toDouble()
}
