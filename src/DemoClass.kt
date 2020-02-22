fun main() {
    var student = Student()
    println(student.name)
    println(student.age)

    println("========")
    student.showInfo()

    println("====Customer====")
    val customer = Customer(email = "ryan@gmail.com")
    customer.email = "alice@gmail.com"
    customer.showInfoCustomer()
}

class Student {
    // props, method
    var name = "Ryan Nguyen"
    var age = 25

    fun showInfo() {
        println(this.name)
        println(this.age)
    }
}

class Customer (var name: String = "", var phone: String = "") {
    var email: String = ""
        set(newEmail) {
            field = newEmail + "<===>"
        }
        get() = field

    init {
        name = "Code4Func"
        phone = "0973999789"
    }

    constructor(email: String) : this() {
        this.email = email
    }

    fun showInfoCustomer() {
        println(this.name)
        println(this.phone)
        println(this.email)
    }
}






