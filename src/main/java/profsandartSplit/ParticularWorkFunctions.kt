package profsandartSplit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ParticularWorkFunctions(
        @SerializedName("ParticularWorkFunction")
        @Expose
        val particularWorkFunction: List<ParticularWorkFunction?>?
)