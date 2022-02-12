package exercises

import java.util.Scanner;

    fun main(arg: Array<String>){
        var input = Scanner(System.`in`);
        println("Enter character whose ascii value is to be determined: ");
        var character = input.next().single()
        var value = character.code
        println("ascii value of thr given character is: $value")
    }
