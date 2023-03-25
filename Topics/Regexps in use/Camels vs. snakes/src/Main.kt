fun getCamelStyleString(inputString: String): String {
    // put your code here
    val words = inputString.split("_")
    var result = words[0].capitalize()
    for (i in 1..words.lastIndex) {
        result = result + words[i].capitalize()
    }
    return result
}
