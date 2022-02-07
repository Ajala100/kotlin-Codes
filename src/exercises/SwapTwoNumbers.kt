package exercises

import java.util.Scanner;

    fun main(arg: Array<String>){
        var input = Scanner(System.`in`);
        println("Enter first Number:")
        var firstNumber = input.nextInt();
        println("Enter second number: ")
        var secondNumber = input.nextInt();
        println("Before swap, first number = $firstNumber")
        println("Before swap, second number = $secondNumber")
        var temporaryStorage = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temporaryStorage;
        println("After swap, first number = $firstNumber");
        println("After swap, second number = $secondNumber");
    }
