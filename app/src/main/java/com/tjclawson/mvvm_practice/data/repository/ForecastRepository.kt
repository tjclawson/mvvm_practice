package com.tjclawson.mvvm_practice.data.repository

import androidx.lifecycle.LiveData
import com.tjclawson.mvvm_practice.data.db.entity.CurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(): LiveData<CurrentWeatherEntry>
}