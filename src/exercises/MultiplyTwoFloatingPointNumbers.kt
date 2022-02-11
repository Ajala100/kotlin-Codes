package exercises

import java.util.Scanner;

    fun main(args: Array<String>){
        var scanner = Scanner(System.`in`);
        println("Enter first float number: ");
        var firstDouble: Double = scanner.nextDouble();
        println("Enter second float number: ");
        var secondDouble: Double = scanner.nextDouble();
        var product = firstDouble * secondDouble;
        println("Product of first double and second Double = $product")

    }
