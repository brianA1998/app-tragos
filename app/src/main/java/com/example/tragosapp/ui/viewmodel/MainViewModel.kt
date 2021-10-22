package com.example.tragosapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tragosapp.domain.Repo
import com.example.tragosapp.vo.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val repo: Repo) : ViewModel() {
    val fetchTragosList = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            emit(repo.getTragosList("margarita"))
        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }
}