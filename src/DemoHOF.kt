fun main() {
    var result = calculate(1, 2, ::execute)
    println(result)

    var result1 = calculate(3, 4, fun(x, y: Int) : Int {
        return x + y
    })
    println(result1)
}

fun calculate(x: Int, y: Int, func: (Int, Int) -> Int) : Int {
    return func(x, y)
}

fun execute(x: Int, y: Int) = x + y
