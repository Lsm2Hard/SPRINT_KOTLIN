fun main() {
    val listIngredient = listOf("Томат", "Огурец", "Капуста")

    println("В рецепте есть следующие ингредиенты:")

    for (i in listIngredient) {

        println("$i")
    }

    print("В рецепте есть следующие ингредиенты:")

    for (i in listIngredient) {

        print("${i} ")
    }
}
