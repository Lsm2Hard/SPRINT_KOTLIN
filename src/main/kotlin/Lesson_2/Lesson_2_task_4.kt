fun main() {
    val crystall = 7
    val iron = 11
    val addNubmer = 100
    val precentOfBuff = 20


    val bafCrystall = ((crystall * addNubmer) / addNubmer * precentOfBuff) / addNubmer
    print("Колличество бонусов от бафа для кристаллической руды ")
    println(bafCrystall)

    val bafIron = ((iron * addNubmer) / addNubmer * precentOfBuff) / addNubmer
    print("Колличество бонусов от бафа для железной руды ")
    print(bafIron)


}