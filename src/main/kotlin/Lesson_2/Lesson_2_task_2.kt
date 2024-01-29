fun main() {
    val employeeCount = 50
    val internsCount = 30
    val salaryInterns = 20000
    val salaryEmploee = 30000
    val expensesEmployee = employeeCount * salaryEmploee
    val generalExpenses = expensesEmployee + (internsCount * salaryInterns)
    val average = generalExpenses / (employeeCount+internsCount)

    println(expensesEmployee)
    println(generalExpenses)
    println(average)
}