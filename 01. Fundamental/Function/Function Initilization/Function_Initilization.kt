// main function
fun main() {
    val user = setUser("Hariz Abdurrafi", 22)
    println(user)

    printUser("Hariz Abdurrafi")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}
