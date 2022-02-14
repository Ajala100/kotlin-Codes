package exercises

import java.util.Scanner;

    fun main (args: Array<String>){
        var scanner = Scanner(System.`in`);
        println("Enter first number: ")
        var firstNumber  = scanner.nextInt();
        println("Enter second number: ");
        var secondNumber = scanner.nextInt();
        var quotient = 0
        var remainder = 0
        quotient = if(firstNumber > secondNumber) {
            firstNumber / secondNumber
        } else{
            secondNumber / firstNumber
        };

        remainder = if(firstNumber > secondNumber) {
            firstNumber % secondNumber
        } else{
            secondNumber % firstNumber
        };

        println("Quotient of the two given numbers are: $quotient");
        println("Remainder of the two given number is: $remainder");
    }
