package com.jkdajac.squearfigures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickSquear(view : View){
        val intent = Intent(this, SquearActivity::class.java)
        startActivity(intent)
    }

    fun onClickRectangle(view : View){
        val intent = Intent(this, RectangleActivity::class.java)
        startActivity(intent)
    }

    fun onClickCircle(view : View){
        val intent = Intent(this, CircleActivity::class.java)
        startActivity(intent)
    }
}