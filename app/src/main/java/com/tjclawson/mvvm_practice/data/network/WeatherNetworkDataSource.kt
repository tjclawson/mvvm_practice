package com.tjclawson.mvvm_practice.data.network

import androidx.lifecycle.LiveData
import com.tjclawson.mvvm_practice.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {

    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String
    )
}