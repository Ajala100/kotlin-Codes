package exercises

import java.util.Scanner
fun main (arg: Array<String>){
    var scanner = Scanner(System.`in`)
    println("Enter string")
    var sentence: String = scanner.nextLine();
    var frequency = 0
    for (value in sentence){
        if (value == 'a')
            frequency++
    }
    println("Frequency of 'a' in given string is : $frequency")
}
