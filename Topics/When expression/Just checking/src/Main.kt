fun main() {
    // write your code here
    println(
        when (readln().toInt()) {
            2 -> "Yes!"
            in 1..4 -> "No!"
            else -> "Unknown number"
        }
    )
}
