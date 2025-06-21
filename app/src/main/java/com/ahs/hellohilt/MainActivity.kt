package com.ahs.hellohilt

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.ahs.hellohilt.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


//tells Hilt to set up DI for MainActivity
//it ensures that all dependencies. required by this MainActivity,
//are provided Automatically
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById<TextView>(R.id.tv)

        mainViewModel.getCollections().observe(this) { data ->
            if (data.isNotEmpty()) {
                tv.text = data.joinToString("\n")
            }
        }
    }
}