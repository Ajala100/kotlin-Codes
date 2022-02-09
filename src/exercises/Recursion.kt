package exercises

fun factorial(number: Int): Long {
    return if(number == 1) number.toLong()
    else number * factorial(number-1)
}

fun main(arg: Array<String>){
    val number = 4
    val result: Long = factorial(number)
    println("Factorial of $number = $result")
}