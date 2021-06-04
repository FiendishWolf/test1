package chapter3

fun main() {
    val bullet1 = BulletMaker()
    bullet1.addLead(300)
    val bullet2 = BulletMaker()
    bullet2.addLead(400)

    val gunpowder = BulletHelper.gunpowder
    val color = Color.RED
    color.color

    val computer = Computer("Ryzen 590X", 16, "RTX3090")
    computer.cpu

    checkNotebook(Gram())
    checkNotebook(hansung())
}

class BulletMaker {
    var lead: Int = 0

    fun addLead(lead: Int) {
        this.lead += lead
    }

    fun make() {
        println("Making...")
    }
}

object BulletHelper{
    var gunpowder: Int = 0

    fun addGunpowder(gunpowder: Int) {
        this.gunpowder += gunpowder
    }
}

enum class Color(val color: String) {
    RED("빨간색"),
    GREEN("초록색"),
    BLUE("파란색")
}

open class Computer(var cpu: String, var ram: Int, var graphics: String = "RTX3090") {
    init {
        println("CPU $cpu, RAM $ram, Graphics $graphics")
    }

    open fun turnOn () {
        println("켜지는 중...")
    }
}

interface INotebook {
    fun openScreen()
}


class Gram : Computer("Ryzen 5900X", 16, "RTX3090"), INotebook {
    var weight : Double = 1.73

    override fun turnOn() {
        super.turnOn()
    }
    override fun openScreen() {
        TODO("Not yet implemented")
    }
}
class hansung: Computer("Ryzen 5900X", 16, "RTX3090"), INotebook{
    override fun openScreen() {
        TODO("Not yet implemented")
    }

}

fun checkNotebook(notebook: INotebook) {
    notebook.openScreen()

    when (notebook) {
        is Gram -> println("그램")
        is hansung -> println("한성")
    }
    if (notebook is Gram) {
        println("그램")
    }
}