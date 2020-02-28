fun main() {
    // Inline function
    println("start program")
    var total = sum(1, 2) {
            x, y -> x + y
    }
    println(total)

    var sqrt = sqrt(4.0) {
        kotlin.math.sqrt(it)
    }
    println(sqrt)

    println("end program")
}

inline fun sum(x: Int, y: Int, noinline action: (Int, Int) -> Int) = action(x, y)
fun sqrt(x: Double, action: (Double) -> Double) = action(x)
