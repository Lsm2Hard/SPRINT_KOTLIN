fun main() {
    val weightProductOne = 20
    val volumeProductOne = 80
    val weightProductTwo = 50
    val volumeProductTwo = 100


    println(
        "Груз с весом 20кг и объемом 80л соответствует категории Average: ${
            (WEIGHT_MIN <= weightProductOne) && (weightProductOne <= WEIGHT_MAX)
                    && (volumeProductOne < VOLUME)
        }"
    )

    println(
        "Груз с весом 20кг и объемом 80л соответствует категории Average: ${
            (WEIGHT_MIN <= weightProductTwo) && (weightProductTwo <= WEIGHT_MAX)
                    && (volumeProductTwo < VOLUME)
        }"
    )


}

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME = 100

