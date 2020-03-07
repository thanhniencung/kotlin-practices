import kotlinx.coroutines.*

//https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core/1.3.3
fun main() {
    // 1. coroutines
    // 2. suspend function
    //demoLaunch1()
    //demoLaunch2()
    //Thread.sleep(4000L)

    /*GlobalScope.launch {
        val res = demoAsync()
        println(res)
    }*/

    //demo3()
    demo4()
}

fun demoLaunch1() {
    GlobalScope.launch(Dispatchers.Main) { // launch a new coroutine in background and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello,") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}

fun demoLaunch2() {
    GlobalScope.launch {
        println("start job")

        var res1 = async(Dispatchers.IO) {
            callHttp()
        }
        var res2 = async {
            callHttp()
        }

        println("end job")
        println("${res1.await()} <-> ${res2.await()}")
    }
}

fun callHttp() : Int {
    Thread.sleep(2000L)
    return 200
}

suspend fun demoAsync() : Int {
    val result = GlobalScope.async {
        callHttp()
    }
    return result.await()
}

val handler = CoroutineExceptionHandler {
    _, exp ->
        println("ERROR -> ${exp.toString()}")
}

fun funcWithException() : Nothing {
    throw  Exception("Loi roi")
}

fun funcWithExceptionAsync() : Int {
    return 10 / (0..1).random()
}

fun demo3() {
    GlobalScope.launch(handler) {
        funcWithException()
    }
}

fun demo4() {
    GlobalScope.launch() {
        async {
            try {
                funcWithExceptionAsync()
            } catch (e: Exception) {
                println(">>> ${e.toString()}")
            }
        }
    }
}
