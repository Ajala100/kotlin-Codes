package exercises
tailrec fun recursiveSums(n: Long, semiResult: Long = 0): Long{
    return if(n <= 0){
        semiResult
    }else{
        recursiveSums((n-1), n + semiResult)}
}
fun main(args: Array<String>){
    var number = 100000.toLong()
    var result = recursiveSums(number)
    println("Sum of upto $number number = $result")
}

