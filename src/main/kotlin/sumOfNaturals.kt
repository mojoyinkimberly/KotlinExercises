import java.util.*
var sum : Long = 0
fun main(args : Array<String>){
    val input = Scanner(System.`in`)
    print("Enter natural number: ")
    var number = input.nextInt()
    for(i in 1..number){
        sum += number
    }
    println("The sum of natural numbers is : $sum ")


}