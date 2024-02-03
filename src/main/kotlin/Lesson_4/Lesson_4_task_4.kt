fun main() {

    val numberDayTraining = 5
    val chekDay = numberDayTraining % 2

    val hands = 1
    val press = 1
    val legs = 0
    val back = 0


    println(
        """" 
        Упражнения для рук: ${chekDay == hands}
        Упражнения для ног: ${chekDay == press}
        Упражнения для спины: ${chekDay == legs}
        Упражнения для пресса: ${chekDay == back}
        
      """
    )


}

