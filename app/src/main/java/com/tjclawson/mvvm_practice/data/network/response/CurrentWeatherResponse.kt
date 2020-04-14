package com.tjclawson.mvvm_practice.data.network.response

import com.google.gson.annotations.SerializedName
import com.tjclawson.mvvm_practice.data.db.entity.CurrentWeatherEntry
import com.tjclawson.mvvm_practice.data.db.entity.Location


data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: Location
)