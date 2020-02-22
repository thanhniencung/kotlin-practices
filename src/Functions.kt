fun main() {
    sayHello1()
    val age = getAge()
    println("age = $age")

    val sum = sum1(1, 4)
    println("sum = $sum")

    /*val statusCode = callApi()
    if (statusCode == 400) {
        error("Bad Request")
        showErrorUI()
    }*/

    val sum2 = sum2(1, 2, 3, 4)
    println("sum2 = $sum2")

    printSum(4, 5)

    showInfo(email = "ryan@gmail.com", fullName = "Ryan Nguyen", age = 25)

    println("-------------")
    showInfo(email = "ryan@gmail.com", fullName = "Ryan Nguyen")
}

fun callApi() = 400

fun showErrorUI() {
    println("showErrorUI func")
}

fun sayHello() {
    println("inside sayHello function")
}

// void
fun sayHello1() : Unit {
    println("inside sayHello function return void or unit")
}

// function return type
fun getAge() : Int {
    return 25
}

fun sum(x: Int, y: Int) : Int {
    return x + y
}

fun sum1(x: Int, y: Int) = x + y

// demo return nothing
fun error(msg: String) : Nothing {
    throw Exception(msg)
}

// unlimited parameter
fun sum2(vararg ints: Int) : Int {
    var sum = 0;
    for (i in ints) {
        sum += i;
    }
    return sum
}

fun printSum(vararg ints: Int) {
    val sum = sum2(*ints)
    println("print sum = $sum")
}

fun showInfo(email: String, fullName: String, age: Int = 20) {
    println(email)
    println(fullName)
    println(age)
}

