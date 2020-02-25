fun main() {
    var city = getCity()
    println(city.first)
    println(city.second)

    var country = getCountry()
    println(country.first)
    println(country.second)
    println(country.third)
}

fun getCity() : Pair<String, String> = Pair("HA NOI", "HN")
fun getCountry() : Triple<String, String, Int> = Triple("HA NOI", "HN", 84)