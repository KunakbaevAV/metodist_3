package profsandartSplit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ListOKZ(
        @SerializedName("UnitOKZ")
        @Expose
        val unitOKZ: List<UnitOKZ?>?
)