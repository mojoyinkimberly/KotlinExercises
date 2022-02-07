import java.util.*

fun main(args : Array<String>){
    var factorial : Long = 1
    val input = Scanner(System.`in`)

    print("Enter a number to get its factorial: ")
    var number = input.nextInt()
    for(i in 1..number)
        factorial *= i
    println("The factorial of $number is $factorial")


    }




