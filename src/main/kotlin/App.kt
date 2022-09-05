import Utils.IOUtils
import kotlin.system.exitProcess

class App {
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
            println("1. Mutiple Game, 2. Play With Bot , 3. Exit")
            input = IOUtils.readString()
            if(input == "1") {
                printInputData()
            }
            else if(input == "2") {
                print("Masih Proses Pembuatan fitur ini")
                exitProcess(0)
            }

            else if(input == "3") {
                print("Terima Kasih")
                exitProcess(0)
            }
        } while (input!="1" || input != "2")
        println()
    }


}