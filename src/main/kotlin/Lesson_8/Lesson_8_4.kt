fun main() {

    var listIng = arrayOf("Томат", "Oгурец", "Капуста")

    for (i in listIng) {
        println("${i}")
    }

    println("Какой ингридиент вы хотите заменить?")
    var ing = readln()

    for (i in listIng) {
        if (ing == i) {
            println("Какой ингридиент добавить?")
            var adIng = readln()
            listIng[i] = adIng

            println("Готово! Вы сохранили следующий список: ${i}")

        }

        //println("Готово! Вы сохранили следующий список: ${i}")
    }

    //println("Такого ингридиента нет в списке")
}



















