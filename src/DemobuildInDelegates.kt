import kotlin.properties.Delegates

//Built-in Delegated Properties
class Language {
    var name: String by Delegates.observable("Java") {
            prop, old, new ->
        println("$old -> $new")
    }

    var age: Int by Delegates.vetoable(5) {
            prop, old, new -> new > 5
    }
}

fun main() {
    val lang = Language()
    lang.name = "kotlin"
    lang.name = "C#"

    println(lang.age)
    lang.age = 2
    println(lang.age)
    lang.age = 6
    println(lang.age)
}