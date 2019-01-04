/**
 * @autor Kunakbaev Artem
 */
data class Profstandart(
        val XMLCardInfo: String,
        var NameProfessionalStandart: String?,
        var kindProfessionalActivity: String?
) {


    override fun toString(): String {
        return "Профстандарт: $NameProfessionalStandart\n" +
                "Направление: $kindProfessionalActivity\n"
    }
}

