fun main() {

    val userYearOfBirth = readln()!!.toInt()
    val thisYear = 2024
    val userAge = thisYear - (thisYear - userYearOfBirth)

    if (userAge >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else userAge < AGE_OF_MAJORITY
    println("вернуть на главный экран")

}


const val AGE_OF_MAJORITY = 18