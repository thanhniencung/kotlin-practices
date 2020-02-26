fun main() {
    var password: String? = "1234567"
    // >6, >8
    var result = password?.validatePass()
    println(result)

    var lib = Library()
    lib.anOrtherFunc()
}

fun String.validatePass() : Boolean {
    if (this.isEmpty()) {
        return false
    }

    if (this.length > 6) {
        return true
    }

    return false
}

class Library{}
fun Library.anOrtherFunc() {
    println("anOrtherFunc")
}