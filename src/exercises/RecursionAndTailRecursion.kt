package exercises

fun main(arg: Array<String>){
    var result = recursiveSum(10000)
    println(result)
}

fun recursiveSum(n: Long): Long{
    return if(n <= 1){
        n
    }else{n + recursiveSum(n -1)}
}