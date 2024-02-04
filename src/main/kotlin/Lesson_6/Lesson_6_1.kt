fun main() {

    println("Создайте логин и пароль")
    val login = readln()
    val password = readln()

    do {
        println("Введите логин и пароль")
        val login1 = readln()
        val password2 = readln()
        if (login == login1 && password2 == password) {
            println("Авторизация прошла успешно")
        } else println("Попробуй еще")


    } while (login == login1 || login != login1)
}




