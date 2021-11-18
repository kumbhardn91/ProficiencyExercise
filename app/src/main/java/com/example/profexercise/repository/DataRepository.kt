package com.example.profexercise.repository

import com.example.profexercise.model.CountryModel
import com.example.profexercise.retroconnection.RetroInstance
import com.example.profexercise.retroconnection.RetroService
import io.reactivex.Observable

class DataRepository {

    fun getCountryInfo(): Observable<CountryModel> {

        val retroInstance = RetroInstance.getRetroInstance().create(RetroService::class.java)
        return retroInstance.getCountryInfoApi()
    }

}