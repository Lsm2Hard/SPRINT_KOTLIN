fun main() {
    val hoursDepart = 9
    val minDepart = 39
    val minWay = 457

    val sumMinute = minWay + minDepart
    val transMinInHours = sumMinute / oneHoursMin
    val searchLastMin = transMinInHours * oneHoursMin

    println("${hoursDepart + transMinInHours}:${sumMinute - searchLastMin}")


}

const val oneHoursMin = 60