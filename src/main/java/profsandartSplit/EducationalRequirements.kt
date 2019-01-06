package profsandartSplit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class EducationalRequirements(
        @SerializedName("EducationalRequirement")
        @Expose
        val educationalRequirement: List<String?>?
)