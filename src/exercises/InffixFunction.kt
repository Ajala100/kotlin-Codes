package exercises
class Ball{
    infix fun square(n: Int): Int {
        return n * n
    }
    infix fun add(n: Int): Int{
        return n + n
    }
}
fun main(arg: Array<String>){
    val m = Ball()
    val result = m square 3
    println("The square is: $result")
    val sum = m add 5
    print("The sum is: $sum")
}