package chapter1

fun main() {
    println("Saiut, amigo!")

    val a: Int = 20
    val b: Long = 30L

    val c: Float = 20.0f
    val d: Double = 30.0

    val e: String? = null
    val f: Int? = null
    val g: Double? = null

    val i = 20.0f
    val j = 20.0

    val number = 30
    val boolean = true
    println(number + 20)
    println(number - 10)
    println(number * 10)
    println(number / 10)
    println(number % 10)
    println(number == 30)
    println(number != 20)

    println(!boolean)
    println(number != 30)
    println(number > 30)
    println(number < 30)
    println(number >= 30)
    println(number <= 30)
    println(number <= 20)

    val foo = "abc"
    var bar = "abc"

    bar = "def"

    println(foo)
    println(bar)

    val weather = "폭탄비"
    println("오늘의 날씨는" + weather + "입니다.")
    println("오늘의 날씨는 $weather 입니다.")
    println("오늘의 날씨는 {${weather.length}} 입니다.")


}