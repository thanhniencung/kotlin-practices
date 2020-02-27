fun main() {
    // InFix Function
    val number: Int = 100
    val result = number + 100

    val result1 = number cong 500
    val result2 = number tru 500
    val result3 = number nhan 500
    val result4 = number chia 500

    println(result1)
    println(result2)
    println(result3)
    println(result4)

    val map = mapOf<String, Int>(
        "key" to 1
    )
}

infix fun Int.cong(number: Int) = this + number
infix fun Int.tru(number: Int) = this - number
infix fun Int.nhan(number: Int) = this * number
infix fun Int.chia(number: Int) = this / number





