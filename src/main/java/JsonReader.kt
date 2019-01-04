import com.google.gson.Gson
import profstandart.Prof
import java.io.File

/**
 * @autor Kunakbaev Artem
 */
class JsonReader {
    fun readProfstandart(xmlFile: String): Prof {
        val gson = Gson()
        return gson.fromJson<Prof>(readXml(xmlFile), Prof::class.java)
    }

    private fun readXml(xmlFile: String): String {
        val file = File(xmlFile)
        val text = file.readText()
        return text
    }

}

