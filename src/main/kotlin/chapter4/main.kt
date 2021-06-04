package chapter4

fun main() {
    val inta = IntArray(5)
    inta[0] = 1
    inta[1] = 2
    inta[2] = 3
    inta[3] = 4
    inta[4] = 5
    //inta[5] = 6
    println(inta[4])

    val intlist = listOf<Int>()
    val mintlist = mutableListOf<Int>()


    mintlist.add(3)
    mintlist.add(4)

    mintlist.addAll(listOf(5, 6, 7))
    mintlist.size

    val mapResult = mintlist.map {
        it * it
//        it.toString()
    }
    val filterResult = mintlist.filter {
        it % 2 == 0
    }
    val sumResult = mintlist.sum()

    val averageResult = mintlist.average()

    val reduceResult = mintlist.reduce { acc, i -> acc * i }

    mintlist.sort()
    mintlist.sorted()
    mintlist.sortDescending()
    mintlist.sortedDescending()

    println(mintlist)
    println(mapResult)
    println(filterResult)
    println(sumResult)
    println(averageResult)
    println(reduceResult)
}