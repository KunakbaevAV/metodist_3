package profsandartSplit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LaborActions(
        @SerializedName("LaborAction")
        @Expose
        val laborAction: List<String?>?
)