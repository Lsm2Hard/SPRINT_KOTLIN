fun main() {

    val groceryList = arrayOf("Томат", "Морковь", "Перец", "Огурец")
    println("Какой ингредиент тебе нужен?")
    val search = readln()

    if (search == groceryList[0] || search == groceryList[1] || search == groceryList[2] || search == groceryList[3]) {
        println("Продукт $search есть в списке")
    } else println("Продукта $search нет в списке")
}


















