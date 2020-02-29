fun main() {
    // closure
    // Code4Func startup
    // vốn 2020 có 100K
    // qua năm 2021, 2022 mỗi năm lỗ 10K
    // từ năm 2023 trở đi mỗi năm lãi 1000K

    val action = startup()

    action() // chain
    action()
    action()
    action()
    action()
}

typealias Result = () -> Unit

fun startup() : Result {
    var money = 100
    var year = 2020

    return {
        if (year == 2020) {
            println("cay cuoc build Code4Func")
            println("money = $money")
        }

        if ((2021..2022).contains(year)) {
            money -= 10
            println("cay cuoc tim khach hang")
            println("money = $money")
        }

        if (year >= 2023) {
            money += 1000
            println("cay cuoc tim khach hang")
            println("money = $money")
        }

        year++
    }
}