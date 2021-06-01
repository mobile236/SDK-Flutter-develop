package com.adapty.flutter.models

import com.adapty.models.GoogleValidationResult
import com.adapty.models.PurchaserInfoModel
import com.google.gson.annotations.SerializedName

data class VisualPaywallPurchaseSuccessResult(
        @SerializedName("purchaserInfo")
        val purchaserInfo: PurchaserInfoModel?,
        @SerializedName("purchaseToken")
        val purchaseToken: String?,
        @SerializedName("googleValidationResult")
        val googleValidationResult: GoogleValidationResult?,
        @SerializedName("product")
        val product: ProductFlutterModel
)