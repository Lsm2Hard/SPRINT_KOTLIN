fun main() {
    println("введите два числа от 0 до 42")
    val firstNumber = readLine()!!.toInt()
    val secondNumber = readLine()!!.toInt()

    if (firstNumber == numberWin1 && secondNumber == numberWin2) || (firstNumber == numberWin2 && secondNumber == numberWin1 )
        println("Поздравляем! Вы выиграли главный приз!")
    else if (firstNumber == numberWin1 || secondNumber != numberWin1) && (secondNumber == numberWin2 || secondNumber != numberWin2)
        println("Вы выиграли утешительный приз!")
   // else firstNumber != numberWin1 && secondNumber != numberWin2


}

const val numberWin1 = 1
const val numberWin2 = 2