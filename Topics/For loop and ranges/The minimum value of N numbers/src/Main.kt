fun main() {
    // write your code here
    val num = readln().toInt()
    var minN = readln().toInt()
    var nextN: Int
    for (i in 2..num) {
        nextN = readln().toInt()
        if (nextN < minN) minN = nextN
    }
    println(minN)
}
