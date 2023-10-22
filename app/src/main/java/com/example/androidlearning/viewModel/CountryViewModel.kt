package com.example.androidlearning.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidlearning.model.Country
import com.example.androidlearning.repository.CountryRepository
import kotlinx.coroutines.launch

class CountryViewModel(private val countryRepository: CountryRepository) : ViewModel() {

    val countriesLiveData: LiveData<List<Country>>
        get() = countryRepository.countries

    fun getCountries() {
        viewModelScope.launch {
            countryRepository.getCountries()
        }
    }
}