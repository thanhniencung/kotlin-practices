fun main() {
    // for, while, do-while
   // 1 -> 10
   for (item in 1..10) {
       print("$item ->")
   }

   println()

   for (item in 1 until 10) {
       print("$item ->")
   }

    println()

    var number = 1..10
    for (item in number) {
        print("$item ->")
    }

    println()
    for (item in 10 downTo  1) {
        print("$item ->")
    }

    println()

    for (item in 1..10 step 2) {
        print("$item ->")
    }

    println()

    // while
    var item = 10
    while (item < 15) {
        print("$item ->")
        item++;
    }

    println()

    // do - while
    var item1 = 100
    do {
        print("$item1 ->")
        item1++;
    } while (item1 < 115)

    println()
    //loop
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i <=> j = $j")
            if (j > i) {
                break@loop
            }
        }
        println("i = $i")
    }

}