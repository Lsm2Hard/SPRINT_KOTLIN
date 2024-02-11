fun main() {

    var arrayWeekWatch = intArrayOf()
    var viewAdvertising = 1..24
    var sumWatch = 0

    for (i in 0..6) {
        var randomViewCount = viewAdvertising.random()
        arrayWeekWatch += i
        arrayWeekWatch[i] = randomViewCount
        sumWatch += arrayWeekWatch[i]
    }
    println("Кол-во просмотров $sumWatch")
}
















