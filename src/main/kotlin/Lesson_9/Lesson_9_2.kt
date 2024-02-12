fun main() {

    val listingr = mutableListOf("Томат", "Огурец", "Капуста")

    println("В рецепте есть базовые ингредиенты:")

    for (i in listingr) {
        println("$i")
    }

    println("Желаете добавить еще?")

    var product = readln()
    if (product == "Да") {
        println("Какой ингредиент вы хотите добавить?")
        var addProduct = readln()
        listingr.add(addProduct)
        println("Теперь в рецепте есть:")
        for (i in listingr) {
            println(i)
        }
    } else (println("Вы решили ничего не добавлять"))
}
