package com.yuly.githubtest.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yuly.githubtest.R
import com.yuly.githubtest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}