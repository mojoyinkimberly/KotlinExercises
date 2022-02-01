fun main(args: Array<String>){
    val a = 100
    when (a) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100(inclusive)")
    }

    val name = "Kim"
    when (name) {
        "Kim" -> println("Welcome $name!")
    else -> println("Invalid user")
    }

}