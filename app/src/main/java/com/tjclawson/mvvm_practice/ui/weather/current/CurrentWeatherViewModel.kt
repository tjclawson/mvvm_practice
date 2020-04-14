package com.tjclawson.mvvm_practice.ui.weather.current

import androidx.lifecycle.ViewModel
import com.tjclawson.mvvm_practice.data.repository.ForecastRepository
import com.tjclawson.mvvm_practice.internal.lazyDeferred

class CurrentWeatherViewModel(private val forecastRepository: ForecastRepository) : ViewModel() {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather()
    }
}
