fun main() {
   val video = Video(
       "Code4Func",
       "http://code4func.com",
       "des"
   )

   val (title, link, des) = video
   println(title)
   println(link)
   println(des)

    val (position, salary) = Programmer("Mobile Developer", 2000, 25)
    println(position)
    println(salary)
}

class Video(val title: String, val link: String, val des: String) {
    operator fun component1(): String = title
    operator fun component2(): String = link
    operator fun component3(): String = des
}

data class Programmer(val position: String, val salart: Int, val age: Int)


