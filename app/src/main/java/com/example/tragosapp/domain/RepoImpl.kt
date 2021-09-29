package com.example.tragosapp.domain

import com.example.tragosapp.data.DataSource
import com.example.tragosapp.data.model.Drink
import com.example.tragosapp.vo.Resource

class RepoImpl(private val dataSource: DataSource) : Repo {


    override fun getTragosList(): Resource<List<Drink>> {
        return dataSource.getTragosList()
    }
}