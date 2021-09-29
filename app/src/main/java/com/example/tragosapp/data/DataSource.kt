package com.example.tragosapp.data

import com.example.tragosapp.data.model.Drink
import com.example.tragosapp.vo.Resource

class DataSource {

    val generateTragosList = listOf(
        Drink(
            "https://www.recetasderechupete.com/wp-content/uploads/2020/06/Margarita.jpg",
            "Margarita",
            "Con azucar,vodka y nueces"
        ),
        Drink(
            "https://www.recetas-argentinas.com/base/stock/Recipe/2-image/2-image_web.jpg",
            "Fernet",
            "Fernet con coca y 2 hielos"
        ),
        Drink("https://pbs.twimg.com/media/CERSHJwXIAATqjl.jpg", "Toro", "Toro con Pritty"),
        Drink(
            "https://i.pinimg.com/originals/87/2c/33/872c3300b36f2e2ac85198fab237ed1f.jpg",
            "Gancia",
            "Gancia con spritt"
        )
    )

    fun getTragosList(): Resource<List<Drink>> {
        return Resource.Success(generateTragosList)
    }

}