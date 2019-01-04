import profstandart.Prof

/**
 * @autor Kunakbaev Artem
 */
object App {
    @JvmStatic
    fun main(args: Array<String>) {
//        val filePatch = "C:\\Java\\metodist_3\\src\\main\\resources\\ps_255"
//        val reader = JsonReader()
//        val prof = reader.readProfstandart(filePatch)
//        prof.print()

        val reader = JsonReader()
        val filePatch = "C:\\Java\\metodist_3\\src\\main\\resources\\ps_255"
        val profstandart: Prof = reader.readProfstandart(filePatch)
//        val profstandart = Gson().fromJson<Profstandart>(xmlFile, Profstandart::class.java)
        println(profstandart.xMLCardInfo!!
                .professionalStandarts!!
                .professionalStandart!!
                .firstSection!!
                .kindProfessionalActivity)
    }
}

