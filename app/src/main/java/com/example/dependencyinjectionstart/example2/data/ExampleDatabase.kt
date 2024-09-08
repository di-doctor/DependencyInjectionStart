package com.example.dependencyinjectionstart.example2.data

import android.util.Log

class ExampleDatabase {

    fun method() {
        Log.d(DATABASE,"DataBase.run")
    }
    companion object{
        const val DATABASE = "dataBase"
    }
}
