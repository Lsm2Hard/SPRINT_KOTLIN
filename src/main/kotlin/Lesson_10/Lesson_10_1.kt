fun main() {

    var deciRollHuman: Int? = getDiceRoll()
    var deciRollMachine = getDiceRoll()
    println("Ход людей: $deciRollHuman")
    println("Ход Машины: $deciRollMachine")

    if (deciRollHuman != null && deciRollMachine != null) {
        if (deciRollHuman > deciRollMachine) {
            println("Победило человечество")
        } else if (deciRollHuman < deciRollMachine) {
            println("Победила машина")
        } else {
            println("Ничья")
        }
    }
}

fun getDiceRoll(): Int? {
    val cubNumber = 1..6
    val getDice = cubNumber.random()
    return getDice
}