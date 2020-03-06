// Covariance vs Contravariance
// link vi = https://viblo.asia/p/covariance-va-contravariance-trong-java-V3m5WO7E5O7
// link en = https://dzone.com/articles/covariance-and-contravariance
fun main() {
    // Generic
    val code4Func1 = Code4FuncRepo<X>()
    code4Func1.insert(X())

    val code4Func2 = Code4FuncRepo<Y>()
    code4Func2.insert(Y())

    val x = createInstance(X())
    val y = createInstance(Y())

    // retrofit
    println(x.toString())
    println(y.toString())

    // Covariance
    var listA: List<A> = listOf()
    var listB: List<B> = listOf()

    // listB = listA // con != cha
    listA = listB // cha = con


    // Contravariance
    var b: Production<B> = object: Production<B> {
        override fun getProduct(type: B): Any {
            return B()
        }
    }

    var a: Production<A> = object: Production<A> {
        override fun getProduct(type: A): Any {
            return A()
        }
    }

    b = a
}

interface Production<in T> {
    fun getProduct(type: T) : Any
}

open class A(){}
class B : A() {}


// T = type, E = element, R = return
class Code4FuncRepo<T> {
    fun insert(rc: T) {
        println("insert ${rc.toString()} ok")
    }
}

fun <T> createInstance(o: T) : T {
    return o
}

data class X(val name: String = "XXX")
data class Y(val name: String = "YYY")