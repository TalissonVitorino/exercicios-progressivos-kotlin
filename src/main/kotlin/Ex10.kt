fun main() {
    print("Digite um numero para A: ")
    val a = readln().toInt()
    print("Digite um numero para B: ")
    val b = readln().toInt()

    when {
        a > b -> println("A é maior ")
        a < b -> println("B é maior ")
        else -> println("\"A=B\"")
    }
}
/*
if (a > b) {
        print("A é maior ")
    } else {
        if (a < b) {
            println("B é maior")

        } else {
            println("\"A=B\"")
        }
    }
 */