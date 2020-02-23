fun main() {
    var book = BookRepoImpl()
    println(book.table)
    book.selectBookById()
    book.saveBook()
}

abstract class BookRepo {
    var table = "book"
    abstract fun selectBookById()
    fun saveBook() {

    }
}

class BookRepoImpl : BookRepo() {
    override fun selectBookById() {
        println("book = Kotlin Programming")
    }
}