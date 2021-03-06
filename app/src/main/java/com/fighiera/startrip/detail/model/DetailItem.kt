package com.fighiera.startrip.detail.model

import androidx.annotation.StringRes
import com.fighiera.startrip.common.entities.PilotUi

data class DetailItem(val pickUp: LocationDetail, val dropOff: LocationDetail, val duration: String, val distance: String, val pilot: PilotUi)

data class LocationDetail(@StringRes val typeRes: Int, val date: String?, val name: String, val picture: String)