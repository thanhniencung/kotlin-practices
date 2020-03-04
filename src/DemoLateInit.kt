fun main() {
    // lateInit
    val baby = MyBaby()
    baby.name = "Code4Func"
    baby.showName()
}

class MyBaby {
    lateinit var name: String

    fun showName() {
        println(name)
    }
}




