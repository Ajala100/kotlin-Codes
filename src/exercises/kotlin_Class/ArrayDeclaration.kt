package exercises.kotlin_Class

import java.util.*

fun main() {
    //To declare an array that can store all kinds of values
    var names = arrayOf("Bola", "Kola", "Yemi", 1, 2, 3)
    //to declare an array that can store specific values
    var names2 = arrayOf<String>("Taiwo", "Saliu", "Funsho")
    // to view content of an array (as an array)
    println(names.contentToString())
    println(names2[0])
    // to set the value of a partcular index
    println(names.set(1,"Tosin"))
    println(names.contentToString())
    // to get the value from a particular index
    println(names2.get(2))
    // to determine the size of an array
    println("Size of array names is: "+ names.size)
    for(companies in names) print("$companies ")
    var myArray: IntArray = intArrayOf(1,2,3,4)
    println(myArray.contentToString())
    if("Bola" in names) println("Bola is present in Array names") else println("Bola is not present in Array names")
}