fun main() {

    println("Угадайте число в промежутке от 1 до 9")
    //var number:Int = readln()!!.toInt()
    var counterTruing = 5

    while (counterTruing >= 1) {
        var number: Int = readln()!!.toInt()
        if (number == 1) {
            println("это была отличная игра")
        } else if (counterTruing == 1) println("Было загадано число ${1}  ")
        else (println("Неверно ${--counterTruing} попытки осталось"))

    }
    println("Было загадано число   ")

}
