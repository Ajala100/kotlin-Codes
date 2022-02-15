package exercises

fun main(){
    var numbers = arrayOf<Int>(1,2,3,4,5,6,7,8,9,10,12);
    var total = 0
    for(number in numbers) total += number
    println("Sum of all the values in array 'numbers' is: $total")
    var average = total / numbers.size
    println("Average value of elements in Array numbers is $average")
}
