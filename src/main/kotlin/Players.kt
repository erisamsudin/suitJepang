import Util.gameResultContract
import Util.gameResultUtils

open class Players(
    val playerOne :String,
    val playerTwo :String,
) {
    private lateinit var gameResultUtils: gameResultUtils

    fun resultGame() {
        gameResultUtils = gameResultUtils()
        gameResultUtils.resultGame(playerOne, playerTwo)
    }
}