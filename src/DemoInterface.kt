fun main() {
    var user = UserRepoImpl()
    user.saveUser(User())
    user.selectUserById("123")

    println(user.ageDefault)

}

// interface
class User{}

interface IUserRepo {
    var ageDefault: Int

    fun saveUser(user: User)
    fun selectUserById(userId: String) {
        println("call from interface")
    }
}

class UserRepoImpl : IUserRepo, i1, i2 {
    override var ageDefault = 18

    override fun saveUser(user: User) {
        println("saveUser")
    }

    override fun selectUserById(userId: String) {
        super.selectUserById(userId)
        println("call inside class")
    }

}

interface i1{}
interface i2{}