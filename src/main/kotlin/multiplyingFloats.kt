import java.util.*

fun main(args : Array<String>){
    val input = Scanner(System.`in`);
    println("Enter two floating numbers: ");
    var number1 : Float = input.nextFloat();
    var number2 : Float = input.nextFloat();
    var product : Float = number1 * number2;
    println("The product of the two floating numbers entered is: $product");

}