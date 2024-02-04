fun main() {
    val isWeatherSolar = true
    val isTentOpen = true
    val nowAirHummidity = 20
    val currentTimeOfYearNow = "Зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (IS_WEATHER_SOLAR == isWeatherSolar) && (NOW_TENT_OPEN == isTentOpen)
                    && (AIR_HUMIDITY == nowAirHummidity)
                    && (CURRENT_TIME_OF_YEAR != currentTimeOfYearNow)
        }"
    )
}

const val IS_WEATHER_SOLAR = true
const val NOW_TENT_OPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val CURRENT_TIME_OF_YEAR: String = "Не зима"



