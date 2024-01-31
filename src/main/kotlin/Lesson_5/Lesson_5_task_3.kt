fun main() {
    println("введите два числа от 0 до 42")
    val firstNumber = readLine()!!.toInt()
    val secondNumber = readLine()!!.toInt()

    if (firstNumber == numberWin1 && secondNumber == numberWin2)
        println("good")
      else if (firstNumber == numberWin2 && secondNumber == numberWin1)
          println("good2")
          else println(123)


   // else if



    //println("только одно вин1")


}

const val numberWin1 = 1
const val numberWin2 = 2