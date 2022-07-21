package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var student = Student("Ali","RIT",20)

        binding.btnSetValue.setOnClickListener(){
            student.age = 28

            binding.apply {
                invalidateAll()
            }

        }

        binding.btngetValue.setOnClickListener(){
            binding.myData = student

        }


    }

}