package chapter1

fun main() {
    salut()
    salut2("men")
    println(sum(5, 7))
    println(sfum(6, 7))
}

fun salut() {
    println("Salut, amigo")
    println("Salut, amigo!")
    println("Salut, amigo3")
    println("Salut, amigo?")
    println("Salut, amigo;;")
}

fun salut2(a: String) {
    println("Salut, $a")
}

fun sum(a: Int, b: Int): Int {
    val result = a + b
    return result
}

fun sfum(a: Int, b: Int) = a + b

fun foo(a: Int): Boolean {
    val result: Boolean
    if (a % 2 == 0) {
        return true
    } else {
        return false
    }
}
fun poo(a: Int): Boolean? {
    val result: Boolean
    if (a >= 5) {
        return true
    } else if (a == 0){
        return null
    } else {
        return false
    }
}

fun boo(a: Int): Boolean? {
    val result: Boolean
    if (a >= 5) {
        return true
    } else if (a == 0 || a == -1){
        return null
    } else {
        return false
    }
}

fun voo(a: Int): Boolean? {
    val result: Boolean
    if (a >= 5 && a <= 10) {
        return true
    } else if (a == 0 || a == -1){
        return null
    } else {
        return false
    }
}

fun zoo(a: Int): Boolean? {
    val result: Boolean
    when {
        a >= 5 && a <= 10 -> return true
        a > 10 -> return true
        a == 0 || a == -1 -> return null
        else -> return false
    }
}