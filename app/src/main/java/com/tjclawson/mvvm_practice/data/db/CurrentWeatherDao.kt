package com.tjclawson.mvvm_practice.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.tjclawson.mvvm_practice.data.db.entity.CURRENT_WEATHER_ID
import com.tjclawson.mvvm_practice.data.db.entity.CurrentWeatherEntry


@Dao
interface CurrentWeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weather: CurrentWeatherEntry)

    @Query("SELECT * FROM current_weather WHERE ID = $CURRENT_WEATHER_ID")
    fun getWeather(): LiveData<CurrentWeatherEntry>
}