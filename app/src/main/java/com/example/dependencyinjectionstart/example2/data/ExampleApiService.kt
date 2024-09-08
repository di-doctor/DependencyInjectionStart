package com.example.dependencyinjectionstart.example2.data

import android.util.Log

class ExampleApiService {

    fun method() {
        Log.d(API_SERVICE,"ApiService.run")
    }
    companion object{
        const val API_SERVICE = "apiService"
    }
}
