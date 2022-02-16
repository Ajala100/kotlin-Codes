package exercises

import java.util.*

fun main(){
    var array = arrayOf<Int>(2,3,4,5,67,51,6,8,21,89)
    var input = Scanner(System.`in`)
    println("Enter Valid integer")
    var value = input.nextInt()
    if(array.contains(value)) println("$value is present in array\n") else println("$value is not present in array")


}