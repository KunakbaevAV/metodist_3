package profsandartSplit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ListEKS(
        @SerializedName("UnitEKS")
        @Expose
        val unitEKS: List<UnitEKS?>?
)