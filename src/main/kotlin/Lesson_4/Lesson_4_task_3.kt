fun main() {
    val weatherSolar = true
    val tentOpen = true
    val nowAirHummidity = 220
    val currentTimeOfYearNow = "Зима"


    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (WEATHER_SOLAR == weatherSolar) && (NOW_TENT_OPEN == tentOpen)
                    && (AIR_HUMIDITY == nowAirHummidity)
                    && (CURRENT_TIME_OF_YEAR != currentTimeOfYearNow)
        }"
    )


}

const val WEATHER_SOLAR = true
const val NOW_TENT_OPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val CURRENT_TIME_OF_YEAR: String = "Не зима"



