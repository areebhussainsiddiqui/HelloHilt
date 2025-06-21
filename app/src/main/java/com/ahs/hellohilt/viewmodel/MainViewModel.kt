package com.ahs.hellohilt.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ahs.hellohilt.di.DataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//This annotation ensures the ViewModel is scoped to a ViewModel lifecycle
// and can be injected into UI controllers like Activities or Fragments using Hilt.
@HiltViewModel
class MainViewModel @Inject constructor(private val repository: DataRepository) : ViewModel() {

    fun getCollections(): LiveData<List<String>> = repository.greetings("greetings")
}