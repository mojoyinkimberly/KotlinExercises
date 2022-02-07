import java.util.*

fun main(args : Array<String>){
    var counter = 0
    print("Enter a sentence: ")
    var sentence : String = readLine()!!
    val input = Scanner(System.`in`)
    print("Enter a character: ")
    var character : Char  = input.next().single()
    for(iterator in sentence){
        if(iterator == character){
            ++counter
        }
    }
    println("The frequency of $character in $sentence is: $counter ")




}