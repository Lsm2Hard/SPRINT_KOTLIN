fun main() {

    val weightMin = 35
    val weightMax = 100
    val volume = 100


    println("Груз с весом 20кг и объемом 80л соответствует категории Average: ${
        (weightMin <= 20) && (20  <= weightMax) && (80 < volume)
    }" )

    println("Груз с весом 20кг и объемом 80л соответствует категории Average: ${
        (weightMin <= 50) && (50  <= weightMax) && (100 < volume)
    }" )


}

