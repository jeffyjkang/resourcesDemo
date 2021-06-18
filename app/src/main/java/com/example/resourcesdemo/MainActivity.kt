package com.example.resourcesdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(R.color.design_default_color_secondary.toString(16))
        println(ContextCompat.getColor(this, R.color.design_default_color_secondary).toString(16))


        demo_text.setBackgroundColor(ContextCompat.getColor(this, R.color.myColor))
    }
}