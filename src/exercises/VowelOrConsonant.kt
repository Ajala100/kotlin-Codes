package exercises

import java.util.Scanner;

fun main(arg: Array<String>){
    var scanner = Scanner(System.`in`);
    var vowels = charArrayOf('a', 'e', 'i', 'o', 'u');
    println("Enter Alphabet")
    var alphabet: Char = scanner.next().single()
    if (vowels.contains(alphabet)) println("$alphabet is a vowel") else println("$alphabet is a consonant")

}