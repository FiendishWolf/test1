package ex1

//1. List와 고차함수를 받아서, filter 기능을 직접 구현하세요.
//2. filter 기능은 리스트의 원소를 받아서, true를 반환하는 것을 새로운 리스트에 추가하는 것을 의미합니다.

//1. Ctrl + Alt + L의 일상화
//2. 리스트를 받는 것에 있어 확장함수를 사용하는 것은 점수에 영향을 미치지 않습니다.
//3. 테일 람다를 활용할 수 있도록, 인자의 순서를 결정하세요.
//4. 제너릭 타입을 사용하세요.
fun main() {
    val ls = listOf("get", "the", "fuck", "out", "of", "here")
    val rs = map(ls) {
        it.length
    }
    val fr = rs.filter {
        it % 2 == 0
    }
    println(fr)
}

fun <T, R> map(ls: List<T>, tf: (T) -> R): List<R> {
    val rs = mutableListOf<R>()
    for (em in ls) {
        rs.add(tf(em))
    }
    return rs
}