package com.example.lab5ppm.ui.theme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.lab5ppm.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivityAPP : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)

        setContent {
            NBAApp()
        }
    }
}