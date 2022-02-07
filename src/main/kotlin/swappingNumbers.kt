import java.util.*

fun main(args : Array<String>){
val input = Scanner(System.`in`)
print("Enter the first number: ")
var firstNumber =  input.nextInt()
print("Enter the second number: ")
var secondNumber = input.nextInt()
var tempValue = firstNumber
firstNumber = secondNumber
secondNumber = tempValue
println("The new first number is $firstNumber and the second number is $secondNumber")

}