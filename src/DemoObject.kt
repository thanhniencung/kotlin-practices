fun main() {
    println(SingletonKotlin.name) // static
    println(SingletonKotlin.doSomething()) // static

    //println(Guru.PI) // public static final float PI = 3.14
    var guru1 = Guru.makeGuru1() // public static function
    var guru2 = Guru.makeGuru2()
}

class Guru {
    companion object Factory {
        fun makeGuru1() = Guru()
        fun makeGuru2() = Guru()
    }
}

object SingletonKotlin{
    var name = "Kotlin"
    fun doSomething() {}
}