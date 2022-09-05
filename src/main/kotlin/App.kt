import Utils.IOUtils
import java.lang.NumberFormatException
import kotlin.system.exitProcess

class App {
    var listPilihan = listOf("1. Gunting ", "2. Kertas", "3. Batu")
    var gameStart = ""
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().printHeader()
            App().run()
        }
    }

    private fun printHeader(){
        println("========================")
        println("====Game Suit Jepang====")
        println("========================")
    }

    private fun printInputData(){
        var playerOneInput = ""
        do {
             playerOneInput = IOUtils.inputData("","Satu")
        } while (playerOneInput === "")

        var playerTwoInput = ""

        do {
            playerTwoInput = IOUtils.inputData("","Dua")
        } while (playerTwoInput === "")

        var result = Players(playerOneInput,playerTwoInput)
        result.resultGame()

    }

    fun run() {
        var input = ""
        do {
            println("Pilih mode bermain")
            println("1. Start Game, 2. Exit")
            input = IOUtils.readString()
            if(input == "1") {
                printInputData()
            }
            else if(input == "2") {
                print("Terima Kasih")
                exitProcess(0)
            }
        } while (input!="1" || input != "2")
        println()
    }


}