package calculator

val EXIT = "/exit"
val HELP = "/help"

fun main() {

    do {
        val inp = readln().split("\\s+".toRegex())
        when (inp[0]) {
            EXIT -> break
            HELP -> help()
            else -> calc(inp)
        }
    } while (true)
    println("Bye!")
}

fun help() {
    println("The program makes arithmetic calculations.")
    println("You can add and subtract int numbers and also use multiple operations.")
}

fun calc(inp: List<String>) {
    var sum = inp[0].toInt()
    for (i in 1..inp.lastIndex-1 step 2) {
        var sig = 1
        for (ch in inp[i]) if (ch == '-') sig *= -1
        try {
            sum += inp[i+1].toInt() * sig
        } catch (e: NumberFormatException) {
            return
        }
    }
    println(sum)
}