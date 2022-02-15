package exercises


fun main(){
    var numberArray = arrayOf<Int>(4,5,23,4,7,98,7,56,65,4,1,2,3);
    var largestValue = 0;
    for(number in numberArray) if (number > largestValue) largestValue = number
    println("Largest value in array numberArray is:  $largestValue")
}
