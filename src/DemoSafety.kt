fun main() {
    // null safety

    // th1
    //var email: String = null
    //println(email)

    // th2
    //var email: String = "ryan@gmail.com"
    //email = null

    var email: String? = null
    println(email?.length)

    var lap = makeLap()
    lap?.showPrice()
}

class Lap{
    fun showPrice() {
        println("show price function")
    }
}

fun makeLap() : Lap? = Lap()