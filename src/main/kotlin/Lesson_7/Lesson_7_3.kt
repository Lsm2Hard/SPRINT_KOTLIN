fun main() {
    println("Введите число")
    val number = readln()!!.toInt()
    val progrez = 0..number step 2

    for (i in progrez) {
        println("${i}")
    }
}