fun main() {
    var user = callApi("xyz", ::callback)
    println(user)

    var user1 = callApi("def", {
        userId ->
        UserDemo(userId, "Ryan", 25)
    })
    println(user1)

    var user2 = callApi("ghk") {
            userId ->
        UserDemo(userId, "Ryan", 25)
    }
    println(user2)

    var user3 = callApi("ijk") {
        UserDemo(it, "Ryan", 25)
    }
    println(user3)
}

fun callback(userId: String) = UserDemo(userId, "Ryan", 25)

data class UserDemo(val userId: String, val name: String, val age: Int)
fun callApi(userId: String, callback: (String) -> UserDemo) = callback(userId)
