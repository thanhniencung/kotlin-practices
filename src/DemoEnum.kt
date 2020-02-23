fun main() {
    var env = Env.PRODUCTION
    println(env)
    println(env.toString())
    println(env.name)
    println(env.ordinal)
    println(env.transform())

    println("====")
    for (item in Env.values()) {
        println("$item - value = ${item.transform()}")
    }
}

enum class Env(val value1: Int) {
    PRODUCTION(100) {
        override fun transform(): String {
            return this.name.toLowerCase()
        }
    },
    STAGING(200) {
        override fun transform(): String {
            return this.name.toLowerCase()
        }
    },
    DEVELOPMENT(300) {
        override fun transform(): String {
            return this.name.toLowerCase()
        }
    };

    abstract fun transform() : String
}