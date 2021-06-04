package ex1

fun main() {
    val hit: Kick = Kick()
    println(hit.upgrade())
}

class Kick(val a: String = listOf<String>("This", "is", "Sparta", "!!!").toString())

fun Kick.upgrade() = this.a.toUpperCase()

// 히히시벌