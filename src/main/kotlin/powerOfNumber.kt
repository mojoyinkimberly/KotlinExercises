import java.util.*

fun main(args : Array<String>){
    val input = Scanner(System.`in`)
    print("Enter a number: ")
    var number : Double = input.nextDouble()
    print("Enter power: ")
    var power : Double = input.nextDouble()
    var result = Math.pow( number , power)
    println("The result is : $result")

}