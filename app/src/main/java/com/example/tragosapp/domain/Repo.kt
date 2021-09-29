package com.example.tragosapp.domain

import com.example.tragosapp.data.model.Drink
import com.example.tragosapp.vo.Resource

interface Repo {
    fun getTragosList(): Resource<List<Drink>>
}