package ru.samitin.buildtypes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.samitin.buildtypes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = BuildConfig.MY_BUILD_TYPE
    }
}