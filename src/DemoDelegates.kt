import kotlin.reflect.KProperty

fun main() {
    val hung = Hung(Hoa(), Mai())

    hung.sbd = "a257"
    println(hung.sbd)

    hung.myTask()
}

interface ITStudent {
    fun learnProgramming()
}

interface MarketingStudent {
    fun learnMarketing()
}

class Hoa : ITStudent {
    var sbd = ""
    override fun learnProgramming() {
        println("Kotlin")
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("$thisRef, thank you for delegating '${property.name}' to me!")
        return sbd
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
        sbd = value
    }
}

class Mai : MarketingStudent {
    override fun learnMarketing() {
        println("Facebook")
    }
}

class Hung(itFriend: Hoa, marketingFriend: Mai) :
    ITStudent by itFriend,  MarketingStudent by marketingFriend {

    var sbd: String by Hoa()

    fun myTask() {
        learnProgramming()
        learnMarketing()
    }
}