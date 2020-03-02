fun main() {
    var man = PurePerson("Ryan")
    var girl = PurePerson("Emily")
    val res = man + girl
    println(res)

    println(man.name)
    man++
    println(man.name)

}

data class PurePerson(val name: String) {
    operator fun plus(p: PurePerson) = "BABY"
    operator fun inc() = PurePerson("INC")
}


