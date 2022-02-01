import java.util.Scanner
fun main(args: Array<String>){
    var number = 0
    var sum: Int = 0
    val scanner = Scanner(System.`in`)
    print("Enter any number: ")
    number = scanner.nextInt()
    while (number != -2){
        if(number != 0) {
            sum += number
        }else{
            break
        }
        number = scanner.nextInt()
    }
       println("The sum is: $sum ")
}