fun main() {
    val age by lazy {
        123
    }

    println(age)

    setName() {
        handler()
    }
}

fun handler() = "Code4Func"

fun setName(handler: () -> String) {
    val name by lazy { handler }
}


