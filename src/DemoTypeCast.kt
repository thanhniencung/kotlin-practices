import javax.crypto.Mac

fun main() {
    // Type Casting - Ep Kieu
    var float: Float = 10.11f
    var int: Int = float.toInt()
    println(int)

    var laptop = createLaptop(Dell())
    if (laptop is Macbook) {
        laptop.showMBPrice()
    } else if(laptop is Dell) {
        laptop.showDellPrice()
    }

    // as
    var dell = laptop as Dell
    dell.showDellPrice()

    var macbook = laptop as? Macbook
    macbook?.showMBPrice()
}

fun createLaptop(lap: Laptop) = lap

open class Laptop() {}

class Macbook : Laptop() {
    fun showMBPrice() {
        println("100")
    }
}

class Dell : Laptop() {
    fun showDellPrice() {
        println("200")
    }
}
