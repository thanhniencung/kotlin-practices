fun main() {
    // if-else, when
    val number = (1..100).random()
    println(number)

    val result1 = if (number % 2 == 0) {
        println("$number chia het cho 2")
    } else {
        println("$number khong chia het cho 2")
    }

    val result = if (number % 4 == 0) {
        println("$number chia het cho 4")
        100
    } else if (number % 5 == 0) {
        println("$number chia het cho 5")
        200
    } else if (number % 6 == 0) {
        println("$number chia het cho 6")
        300
    } else {
        println("$number khong chia het cho 4, 5, 6")
        400
    }
    println(result)

    // when <=> switch-case
    val status = when(number) {
        in 1..16 -> {
            println("Chua du tuoi vi thanh nien")
            100
        }

        18 -> {
            println("den tuoi lay vo")
            200
        }

        in 19..100 -> {
            println("thich gi lam lam do")
            300
        }

        else -> {
            println("khong biet")
            400
        }

    }

    println(status)

}