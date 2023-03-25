fun main() {
    val text = readln()
    // write your code here
    val outStr = text.replace("[aA]+".toRegex(), "a")
    println( outStr )
}