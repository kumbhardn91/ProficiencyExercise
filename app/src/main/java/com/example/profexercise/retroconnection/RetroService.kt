package com.example.profexercise.retroconnection

import com.example.profexercise.model.CountryModel
import io.reactivex.Observable
import retrofit2.http.GET


interface RetroService {

    @GET("facts.json")
    fun getCountryInfoApi(): Observable<CountryModel>
}