fun main() {
    try {
        var float = 10 / (0..1).random()
        println(float)
    } catch (e: Exception) {
        println(e.toString())
    } finally {
        println("done")
    }

    try {
        var number = parseInt("abc")
        println(number)
    } catch (e: Exception) {
        println(e.toString())
        //
    }

    var result = try {
        var number = parseFloat(123)
        println(number)
        123
    } catch (e: CustomException) {
        println(e.toString())
        456
    }

    println(result)

    println("end program")
}

fun parseInt(s: String) : Int = s.toInt()

fun parseFloat(s: Any) : Float {
    if (s is Int) {
        throw CustomException("Loi ne")
    }

    var str = s as String
    return str.toFloat()
}

class CustomException(val msg: String) : Throwable(msg) {

}