package exercises

import java.util.*

fun main(){
    var count = 0
    var largestNumber = 0
    var scanner = Scanner(System.`in`);
    while(count < 3){
        println("Enter Number")
        var number = scanner.nextInt();
        if(number > largestNumber) largestNumber = number else largestNumber = largestNumber;
        count++
    }
    println("Largest number is $largestNumber")
}