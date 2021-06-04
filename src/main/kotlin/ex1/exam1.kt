package ex1

fun main() {
    println(exam(2, 3, 3))
}

fun exam(x: Int, y: Int, z: Int): Int {
    when {
        x % 2 == 0 && y % 2 == 0 && z % 2 == 0 -> return x + y + z
        x % 2 == 1 && y % 2 == 1 && z % 2 == 1 -> return x * y * z
        else -> return 0
    }
}