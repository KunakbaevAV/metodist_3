package profstandart

class ProfParser {
    fun parsing(): Profstandart {
        val reader = JsonReader()
        val filePatch = "C:\\Java\\metodist_3\\src\\main\\resources\\ps_255"
        val profstandart: Profstandart = reader.readJson(filePatch)

//        val size = profstandart.xMLCardInfo!!
//                .professionalStandarts!!
//                .professionalStandart!!
//                .thirdSection!!
//                .workFunctions!!
//                .generalizedWorkFunctions!!
//                .generalizedWorkFunction!!.size
//        val functions = Array<Profstandart.XMLCardInfo.ProfessionalStandarts.ProfessionalStandart.ThirdSection.WorkFunctions.GeneralizedWorkFunctions.GeneralizedWorkFunction?>(size) { null }
//
//        for (i in 0 until size) {
//            functions[i] = profstandart.xMLCardInfo
//                    .professionalStandarts!!
//                    .professionalStandart!!
//                    .thirdSection!!
//                    .workFunctions!!
//                    .generalizedWorkFunctions!!
//                    .generalizedWorkFunction!![i]
//        }
//
//        for (i in 0 until size) {
//            println(functions.get(i)!!.nameOTF)
//        }
        return profstandart
    }

}