fun main() {
    // hiding constructor
    //var k = Kotlin()
    //k.run()

    Kotlin.run()
}

class Kotlin private constructor() {
    companion object {
        fun run() {

        }
    }
}
