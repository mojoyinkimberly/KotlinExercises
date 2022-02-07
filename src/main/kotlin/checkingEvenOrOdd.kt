import java.util.*

fun main(args : Array<String>){
val input = Scanner(System.`in`)
print("Enter a number: ")
var number = input.nextInt();
if(number%2==0){
    println("number is even")
}else{
    println("number is odd")
}
}