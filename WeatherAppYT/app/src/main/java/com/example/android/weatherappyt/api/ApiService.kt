package com.example.android.weatherappyt.api

interface ApiService {

    @GET("weather/Luanda")
    suspend fun getWeather():
}