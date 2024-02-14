fun main() {

    val listIngredients = mutableListOf(2, 50, 15)
    println("Сколько порций нужно?")
    val numberOfServings = readln()!!.toInt()

    val newListIngredients = listIngredients.map {
        it * numberOfServings
    }
    print("На ${numberOfServings} порций вам понадобится: ")

    newListIngredients.forEach {
        when (it) {
            0 -> println("Яиц")
            1 -> println("Молока")
            2 -> println("сливочного масла")
        }
        print("$it ")
    }
}