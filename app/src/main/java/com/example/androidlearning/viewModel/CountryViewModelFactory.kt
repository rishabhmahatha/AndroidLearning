package com.example.androidlearning.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidlearning.repository.CountryRepository
import javax.inject.Inject

class CountryViewModelFactory @Inject constructor(private val repository: CountryRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CountryViewModel(repository) as T
    }
}