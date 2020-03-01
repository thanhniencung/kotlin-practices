fun main() {
    printNumber()
}

public fun <T> Iterable<T>.customForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun printNumber() {
    val range = 0..20
    range.customForEach customLoop@{
        if (it == 9) {
            return@customLoop // continue
        }
        println(it)
    }
    println("end")


    println("==============")
    println("==============")

    val newRange = 0..10
    newRange.forEach( fun (item: Int) {
        if (item == 9) {
            return
        }
        println(item)
    })
}