import java.util.*

fun main(args : Array<String>){
    val input = Scanner(System.`in`)
    print("Enter the year: ")
    var year = input.nextInt()
    if(year%4==0 && year%400==0 ) {
        println("It is a leap year")
    }else{
        println("It is not a leap year")
    }
}