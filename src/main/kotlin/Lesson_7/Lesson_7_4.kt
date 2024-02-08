fun main() {
    println("Cколько секунд нужно засечь")
    val number = readln()!!.toInt()

    for (i in number downTo 0) {
        println("${i}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}