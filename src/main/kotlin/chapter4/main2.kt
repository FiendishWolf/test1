package chapter4

fun main() {
    val list = listOf<Int>(1, 2, 2, 3)
    val set = setOf(1, 2, 2, 3)
    val distinct = list.distinct()

    println(list)
    println(set)
    println(distinct)

    val stringMap = mutableMapOf<String, String>()
    stringMap["A"] = "a"
    stringMap["B"] = "b"
    println(stringMap)
    stringMap["C"] = "c"
    stringMap["B"] = "acba"
    println(stringMap)

    stringMap.keys
    stringMap.values

    val pair1 = Pair<String, Int>("a", 1)
    val pair2 = "a" to 2.0
    val triple1 = Triple<String, Int, Double>("a", 1, 1.0)
    println(pair1)
    println(triple1)
    println(pair2)

    val range1 = 1..100


    val bang: List<Int> = listOf<Int>(1, 2, 3)
    val bangshot: Set<Int> = bang.toSet()
    val bangpow: Array<Int> = bang.toTypedArray()
    val bangarrow: IntArray = bang.toIntArray()
    bangshot.toList()
    bangshot.toMutableList()
    bangarrow.toList()
    bangarrow.toMutableList()
    stringMap.keys
    stringMap.values
    stringMap.entries
}