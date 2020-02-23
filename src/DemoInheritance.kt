fun main() {
    var dog = Dog()
    dog.talk()

    var cat = Cat("Cat")
    cat.talk()
}

open class Animal(var name: String = "") {
    open fun talk(){}
}

class Dog : Animal() {
    init {
        this.name = "Dog"
    }

    override fun talk() {
        println("Gau gau")
    }
}

class Cat : Animal {
    init {
        this.name = "Cat"
    }

    constructor(name: String) : super(name)

    override fun talk() {
        println("Meo meo")
    }
}


