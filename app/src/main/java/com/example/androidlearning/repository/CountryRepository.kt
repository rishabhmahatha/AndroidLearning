package com.example.androidlearning.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.androidlearning.model.Country
import com.example.androidlearning.retrofit.CountriesApi
import javax.inject.Inject

class CountryRepository @Inject constructor(private val countriesApi: CountriesApi) {

    private val country: MutableLiveData<List<Country>> = MutableLiveData()
    val countries: LiveData<List<Country>>
        get() = country

    suspend fun getCountries() {
        if (countriesApi.getCountries().body() == null) {
            country.postValue(countriesApi.getCountries().body())
        }
    }
}