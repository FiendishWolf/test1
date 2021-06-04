package chapter6

fun main() {
    val list = listOf("this", "is", "sparta", "!!!")
    val result = map(list){
        it.toUpperCase()
    }
    val result1 = map(list){
        it.length
    }
    println(result)
    println(result1)
}

fun <T, R> map(list: List<T>, transform: (T) -> R): List<R> {
    val result = mutableListOf<R>()
    for (element in list) {
        result.add(transform(element))
    }
    return result
}