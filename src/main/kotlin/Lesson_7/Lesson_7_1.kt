fun main() {
    val passwordLength = 6
    val digits = '0'..'9'
    val lowercaseLetters = 'a'..'z'

    var password = ""

    for (i in 0 until passwordLength) {
        if (i % 2 == 0) {
            password += digits.random()
        } else {
            password += lowercaseLetters.random()
        }
    }

    println("$password")
}
