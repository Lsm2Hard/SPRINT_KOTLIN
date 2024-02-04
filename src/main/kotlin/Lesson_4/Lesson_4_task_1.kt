fun main() {

    val preorderToday = 13
    val preorderTommorow = 9

    println("Доступность столиков на сегодня ${preorderToday < ALL_TABLE} " +
            "\nДоступность столиков на завтра ${preorderTommorow < ALL_TABLE}")
}

const val ALL_TABLE = 13