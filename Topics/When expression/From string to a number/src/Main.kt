fun main() {
    val numStr = readln()
    val num = when (numStr) {
        "one" -> 1
        "zero" -> 0
        "two" -> 2
        "three" -> 3
        "four" -> 4
        "five" -> 5
        "six" -> 6
        "seven" -> 7
        "eight" -> 8
        "nine" -> 9
        else -> -1
    }
    println(num)
}