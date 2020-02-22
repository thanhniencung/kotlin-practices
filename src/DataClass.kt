fun main() {
    var book1 = Book("Kotlin Programming", "Ryan", "2020")
    var book2 = Book("Kotlin Programming", "Ryan", "2020")

    println(book1 == book2)
    println(book1.toString())

    var baby1 = Baby("A", 1)
    var baby2 = Baby("A", 1)

    println(baby1 == baby2)
    println(baby1.toString())
}

data class Book(val title: String, val author: String, val date: String)

class Baby(val name: String, val age: Int)