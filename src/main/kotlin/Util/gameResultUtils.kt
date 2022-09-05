package Util

public class gameResultUtils : gameResultContract{

    override fun resultGame(playerOne: String, playerTwo: String) {
        when {
            playerOne === playerTwo -> println("!! Draw !!")
            playerOne == "Kertas" && playerTwo == "Gunting" -> println("Player Dua Menang")
            playerOne == "Kertas" && playerTwo == "Batu" -> println("Player Satu Menang")
            playerOne == "Gunting" && playerTwo == "Kertas" -> println("Player Satu Menang")
            playerOne == "Gunting" && playerTwo == "Batu" -> println("Player Dua Menang")
            playerOne == "Batu" && playerTwo == "Kertas" -> println("Player Dua Menang")
            playerOne == "Batu" && playerTwo == "Gunting" -> println("Player Satu Menang")
        }
        println()
    }

}