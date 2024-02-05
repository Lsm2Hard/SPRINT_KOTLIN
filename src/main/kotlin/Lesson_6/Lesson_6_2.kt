fun main() {

    println("Сколько секунд засечь")
    var second = readln()!!.toInt()
    var count = 0

    while (second > 0) {
        --second
        count += 1
        println("${second}")
        Thread.sleep(600)
    }
    println("Прошло ${count} секунд")
}
