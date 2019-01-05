package profstandart

import com.google.gson.Gson
import java.io.File

/**
 * @autor Kunakbaev Artem
 */
class JsonReader {
    fun readJson(xmlFile: String): Profstandart {
        val gson = Gson()
        val text = File(xmlFile).readText()
        return gson.fromJson<Profstandart>(text, Profstandart::class.java)
    }
}

