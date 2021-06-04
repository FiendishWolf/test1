package chapter5

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    println(list.even())

    val pow: (String) -> Int = { str ->
        str.length
    }
    println(pow("abc"))

    val bang: (String) -> Unit = { str ->
        println("Salut, $str")
    }
    bang("amigo")

    val pang: (String) -> Unit = {
        println("Salut, $it")
    }
    pang("amigo")

    bow(bang)
    bow(::saw)
    bow{
        println(it.toLowerCase())
    }
}

fun bow(block: (String) -> Unit) {
    block("aAa")
}

fun saw(a: String){
    println(a.toUpperCase())
}

