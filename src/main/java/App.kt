import profstandart.Prof
import profstandart.Prof.XMLCardInfo.ProfessionalStandarts.ProfessionalStandart.ThirdSection.WorkFunctions.GeneralizedWorkFunctions.GeneralizedWorkFunction

/**
 * @autor Kunakbaev Artem
 */
object App {
    @JvmStatic
    fun main(args: Array<String>) {

        val reader = JsonReader()
        val filePatch = "C:\\Java\\metodist_3\\src\\main\\resources\\ps_255"
        val profstandart: Prof = reader.readProfstandart(filePatch)

        val size = profstandart.xMLCardInfo!!
                .professionalStandarts!!
                .professionalStandart!!
                .thirdSection!!
                .workFunctions!!
                .generalizedWorkFunctions!!
                .generalizedWorkFunction!!.size
        val functions = Array<GeneralizedWorkFunction?>(size) { null }

        for (i in 0 until size) {
            functions[i] = profstandart.xMLCardInfo
                    .professionalStandarts!!
                    .professionalStandart!!
                    .thirdSection!!
                    .workFunctions!!
                    .generalizedWorkFunctions!!
                    .generalizedWorkFunction!![i]
        }

        for (i in 0 until size) {
            println(functions.get(i)!!.nameOTF)
        }

    }
}

