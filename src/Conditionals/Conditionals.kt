fun main() {
    val age = 21
    when {
        age < 18 -> {
            println("You cannot register!")
        }
        age < 21 -> {
            println("Maybe you can register.")
        }
        else -> {
            println("You can register!")
        }
    }
}