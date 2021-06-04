package chapter5

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    println(list.even())
    list.operate {
        this.filter { it % 2 == 0 }
            .sum()
    }
    val result = list.chunckList(4)
    println(result)
}

fun List<Int>.even(): List<Int> {
    return this.filter { it % 2 == 0 }
}

fun List<Int>.operate(block: List<Int>.() -> Unit) {
    this.block()
}

fun List<Int>.chunckList(size: Int): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()
    var i = 0
    val temp = mutableListOf<Int>()
    for (element in this) {
        temp.add(element)
        if (temp.size == size) {
            val a = mutableListOf<Int>()
            a.addAll(temp)
            result.add(a)
            temp.clear()
        }
    }
    if (temp.isNotEmpty()) {
        result.add(temp)
    }
    return result
}