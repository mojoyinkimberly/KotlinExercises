import java.util.*

fun main(args: Array<String>){
    val input = Scanner(System.`in`)
    print("Enter the number: ")
    var number = input.nextInt()
    print("Enter the divisor: ")
    var divisor = input.nextInt()
    var quotient = number / divisor
    var remainder = number % divisor
    println("The quotient is $quotient and the remainder is: $remainder")

}