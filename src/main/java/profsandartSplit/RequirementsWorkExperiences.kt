package profsandartSplit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RequirementsWorkExperiences(
        @SerializedName("RequirementsWorkExperience")
        @Expose
        val requirementsWorkExperience: List<String?>?
)