package com.example.dependencyinjectionstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjectionstart.R

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel:ExampleViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()
    }
}