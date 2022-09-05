package Utils
import java.lang.NumberFormatException

object IOUtils {
    fun inputData(default: String ="", playerInfo : String ): String {
        println("""
            Player ${playerInfo}
            Silahkan Pilih
            ****************************
            1. Kertas 2. Gunting 3. Batu
            ****************************
            """.trimIndent())
        return when(readLine()?.lowercase()) {
            "1" -> "Kertas"
            "2" -> "Gunting"
            "3" -> "Batu"
            else ->  {
                default
            }
        }
    }

    fun readString(default: String =""): String {
        return try {
            readLine()?.toString() ?: default
        }catch (e:NumberFormatException){
            default
        }
    }
}