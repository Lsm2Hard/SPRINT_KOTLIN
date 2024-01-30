fun main() {

    val preorderToday = 13
    val preorderTommorow = 9

    println("Доступность столиков на сегодня ${preorderToday < allTable} \nДоступность столиков на завтра ${preorderTommorow < allTable}")
}

const val allTable = 13