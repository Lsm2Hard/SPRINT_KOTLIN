fun main() {

    var number = 1000..9999
    var result = ""

    for (i in 0 until 1) {

        result += number.random()
        println("Ваш код авторизации:$result")

        var autenth = readln()

        if (result != autenth) {
            println("Неверно, новый код:${number.random()}")
            //Если код введён неверно – программа вышлет новый
            // (отобразит в консоли)
            // и снова будет запрашивать его ввод для попытки авторизации

        } else (println("Добро пожаловать"))

    }

}