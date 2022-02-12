package exercises

fun displayBorder(character: Char = '=', length: Int = 15){
    for(i in 1..length){
        print(character)
    }
}
fun main(arg: Array<String>){
    println("Output when no argument is passed:")
    displayBorder()
    println("\noutput when '*' is used as first argument:")
    displayBorder('*')
    println("\nOutput when '*' is used as first argument and 5 as second argument:")
    displayBorder('*', 5)
    println("\nOutput when second argument is changed:")
    displayBorder(length = 12)
    println("\n Output when Character argument is changed ")
    displayBorder('+')
}