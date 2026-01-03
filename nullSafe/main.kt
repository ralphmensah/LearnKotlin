

fun main(){
val user: User = User(1, "Kweku", "kweku@kwekutech.com", "Creative Director")
val user1: User = User(1, null, "kweku@kwekutech.com", "Creative Director")
val user2: User = User(1, "Kweku", null, "Creative Director")
val user3: User = User(1, "Kweku","kweku@kwekutech.com", null)

// println(user?.name)/ println(user?.name)

// println(user?.name)
printUserProfile(user)
printUserProfile(user1)

printUserProfile(user3)
printUserProfile(user2)
}

fun printUserProfile(user:User?){
    println("Id : ${user?.id}")
    println("Name : ${user?.name?:"Guest"}")
    println("Email : ${user?.email?: throw Exception("Email is Missing")}")
    println("Bio : ${user.bio ?:"Bio is Missing"}")
}

class User(
    val id: Int,
    val name:String?,
    val email:String?,
    val bio: String?,
)