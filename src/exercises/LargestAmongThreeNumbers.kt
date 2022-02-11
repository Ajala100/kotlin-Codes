package exercises

import java.util.Scanner;

fun main() {

    var input = Scanner(System.`in`)
    var largestNumber = 0
    var count = 0
    while (count < 3){
        println("Enter Valid Integer")
        var number = input.nextInt()
        if(number > largestNumber) largestNumber = number
        count++
    }
    println("Largest number is: $largestNumber")
}