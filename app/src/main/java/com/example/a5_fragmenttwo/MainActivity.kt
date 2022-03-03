package com.example.a5_fragmenttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a5_fragmenttwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonA.setOnClickListener {
            //var firstFragment = FirstFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,FirstFragment()).addToBackStack(null).commit()
        }

        binding.buttonB.setOnClickListener {
           // val secondFragment = SecondFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,SecondFragment()).addToBackStack(null).commit()
        }
    }
}