fun findSerialNumberForGame(listGames: List<String>) {
    val game = readln()
    for (str in listGames) {
        val gameDetails = str.split("@")
        if (gameDetails[0].equals(game)) {
            println("Code for Xbox - ${gameDetails[1]}, for PC - ${gameDetails[2]}")
            return
        }
    }
}