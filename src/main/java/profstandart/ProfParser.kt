package profstandart

import profsandartSplit.ProfstandartSplit

class ProfParser {
    fun parsing(): ProfstandartSplit {
        val reader = JsonReader()
        val filePatch = "C:\\Java\\metodist_3\\src\\main\\resources\\ps_255"
        val profstandart: ProfstandartSplit = reader.readJson(filePatch)
        return profstandart
    }
}