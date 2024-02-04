fun main() {
    val hoursDepart = 9
    val minDepart = 39
    val minWay = 457

    val sumMinute = minWay + minDepart
    val transMinInHours = sumMinute / ONE_HOURS_MIN
    val searchLastMin = transMinInHours * ONE_HOURS_MIN

    println("${hoursDepart + transMinInHours}:${sumMinute - searchLastMin}")


}

const val ONE_HOURS_MIN  = 60