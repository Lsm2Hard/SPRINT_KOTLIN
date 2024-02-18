fun validateLength(dataLoginOrPassword: String?, minLength: Int = 4): Boolean {
    if (dataLoginOrPassword < minLength) {
        println("$dataLoginOrPassword недостаточно длинный.")
        return false
    }
    return true
}

fun main() {

    print("Введите логин: ")
    var login = readln()
    while (validateLength(login)) {
        print("Введите логин: ")
        login = readln()
    }

    print("Введите пароль: ")
    var password = readln()
    while (validateLength(password)) {
        print("Введите пароль: ")
        password = readln()
    }
    println("Добро пожаловать!")
}
