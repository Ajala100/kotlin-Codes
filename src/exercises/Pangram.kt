package exercises

import java.util.*

fun main(){
    var alphabets = arrayOf<String> ("a", "b", "c", "d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
    var scanner = Scanner(System.`in`)
    println("Enter sentence: ")
    var set = mutableSetOf<String>()
    var sentence = scanner.nextLine()
    for(letter in sentence) set.add(letter.toString())
    var count = 0
    for (value in set) if(alphabets.contains(value)) count++
    if(count == 26) println("Input is a Pangram") else println("Input is not a Pangram");
}