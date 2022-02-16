package exercises

import java.sql.SQLOutput
import java.util.*

fun main(){
    val vowelLetters = arrayOf<String>("a", "e", "i", "o", "u");
    var scanner = Scanner (System.`in`);
    println("Enter String")
    var string = scanner.nextLine();
    var stringWithoutVowelLetters = mutableListOf<String>();
    for(value in string) if(vowelLetters.contains(value.toString())) continue else stringWithoutVowelLetters.add(value.toString());
    println("Input without vowel letters: ")
    for(value in stringWithoutVowelLetters) print(value);
}