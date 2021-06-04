package chapter2

fun main() {

}

open class gun(val bullet:String) {
    val bar = "abc"

    open fun foo(){
        println("Salut, amigo.")
    }
    private fun poo(){
        println("Salut, amigo?")
    }
    protected fun bang(){
        println("Salut, amigo...")
    }
}

class triger : gun("총알") {
    override fun foo() {
        super.foo()
        println("Salut, amigo?!")
    }
    fun convert(a: String){
        val length: Int = a.length
        val double: Double = length.toDouble()

        val text: String? = a as String?
        val text2 = a as Int?

        val double2 = 3.5
        val int2 = double2 as Int
        val int3 = double2.toInt()
    }
    fun shot(){
        bang()
        println("Salut, amigo!")
    }
    fun shot(a:String){
        bang()
        println("Salut, $a!")
    }
    fun shot(a:Int){
        bang()
        println("Salut, $a!")
    }
}