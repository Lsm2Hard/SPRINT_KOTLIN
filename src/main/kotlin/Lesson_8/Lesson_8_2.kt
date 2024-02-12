fun main() {

    val groceryList = arrayOf("Томат", "Морковь", "Перец", "Огурец")
    println("Какой ингредиент тебе нужен?")
    val search = readln()

    for (i in groceryList) {
        if (search == i) {
            println("Ингредиент $search в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}
















