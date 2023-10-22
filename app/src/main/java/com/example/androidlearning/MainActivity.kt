package com.example.androidlearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.example.androidlearning.viewModel.CountryViewModel
import com.example.androidlearning.viewModel.CountryViewModelFactory
import javax.inject.Inject

class MainActivity : ComponentActivity() {
    lateinit var countryViewModel: CountryViewModel

    @Inject
    lateinit var countryViewModelFactory: CountryViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as AndroidLearning).applicationComponent.inject(this)

        countryViewModel = ViewModelProvider(this, countryViewModelFactory)[CountryViewModel::class.java]
        countryViewModel.getCountries()
    }


}
