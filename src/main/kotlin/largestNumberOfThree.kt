import java.util.*

fun main(args:Array<String>){
    val input = Scanner(System.`in`)
    print("Enter the first number: ")
    var firstNumber = input.nextInt()
    print("Enter the second number: ")
    var secondNumber = input.nextInt()
    print("Enter the third number: ")
    var thirdNumber = input.nextInt()
    var largestNumber = firstNumber
    if (secondNumber > firstNumber && firstNumber < secondNumber){
        largestNumber = secondNumber
    }
    if(thirdNumber > secondNumber && thirdNumber > firstNumber){
        largestNumber = thirdNumber
    }
    if(firstNumber > secondNumber && firstNumber > thirdNumber) {
        largestNumber = firstNumber
    }
    println("The largest number is : $largestNumber")
    }


