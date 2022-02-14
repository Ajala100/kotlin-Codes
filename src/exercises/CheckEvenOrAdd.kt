package exercises

import java.util.Scanner;


    fun main(arg: Array<String>){
        var input = Scanner(System.`in`)
        println("Enter valid integer")
        var number: Int = input.nextInt()
        if(number % 2 == 0 ){
            println("$number is an even number")
        } else {println("$number is an odd number")};


    }
