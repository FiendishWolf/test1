package chapter6

fun main() {
    bul {
        println("Salut, lambda")
    }
    let {
        println(it)
    }
    shot {
        it.length
    }
    bang { str1, str2 ->
        str1 + str2
    }
    bang { str1, _ ->
        str1
    }
    boom("amigO"){
        it.length
    }
    kaboom({it.length}, "amiGo")

    pang {
        if (it != null){
            it.length
        } else{
            null
        }
    }
    pang {
        it?.length
    }
    pang {
        val length: Int? = it?.length
        length?.inc()
        length
    }

    pang {
        it!!.length
    }
    fang {
        if (it != null){
            it.length
        } else {
            -1
        }
    }
    fang {
        it?.length ?: -1
    }
}

fun bul(block: () -> Unit) {
    block()
}

fun let(block: (String) -> Unit) {
    block("Amigo")
}

fun shot(block: (String) -> Int) {
    block("amigo")
}

fun bang(block: (String, String) -> String) {
    block("salut", "aMigo")
}

fun boom(a: String, block: (String) -> Int) {
    block(a)
}

fun kaboom(block: (String) -> Int, a: String) {
    block(a)
}

fun pang(block: (String?) -> Int?) {
    block(null)
}
fun fang(block: (String?) -> Int) {
    block(null)
}

fun papang(block: ((String) -> Int)?) {
    if (block != null){
        block("amigo")
    }
    block?.invoke("amigo")

    block!!.invoke("amigo")
}