package com.example.tragosapp.data

import com.example.tragosapp.data.model.Drink
import com.example.tragosapp.vo.Resource
import com.example.tragosapp.vo.RetrofitClient

class DataSource {

    suspend fun getTragoByName(tragoName: String): Resource<List<Drink>> {
        return Resource.Success(RetrofitClient.webservice.getTragosByName(tragoName).drinkList)
    }
}