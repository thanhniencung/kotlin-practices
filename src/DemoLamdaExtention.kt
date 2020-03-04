
fun main() {
    val stringBuilder = StringBuilder()
    stringBuilder.append("a")
    stringBuilder.append("b")
    stringBuilder.append("c")
    println(stringBuilder.toString())

    var str1 = buildString {
        append("1")
        append("2")
        append("3")
    }
    println(str1)

    stringBuilder.run {
        append("1")
        append("2")
        append("3")
    }

    stringBuilder.let {
        it.append("")
    }

    stringBuilder.apply {

    }

    //public inline fun <T, R> T.run(block: T.() -> R): R {
    //public inline fun <T, R> T.let(block: (T) -> R): R {
}

inline fun buildString(builder: StringBuilder.() -> Unit) : String {
    val stringBuilder = StringBuilder()
    stringBuilder.builder()
    return stringBuilder.toString()
}