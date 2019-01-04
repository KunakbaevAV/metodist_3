import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SimpleProf() {
    @SerializedName("NameProfessionalStandart")
    @Expose
    val nameProfessionalStandart: String? = null

    fun print() {
        println(nameProfessionalStandart)
    }

}

