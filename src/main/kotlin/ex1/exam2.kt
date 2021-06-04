package ex1

fun main() {
    val intlist = listOf<Int>(1, 2, 3, 4, 5, 8, 9)
    val targetSearch = intlist.filter {
        it % 2 == 0
    }
    val squareTarget = targetSearch.map {
        it * it
    }
    val sumThem = squareTarget.sum()

    println(sumThem)
}