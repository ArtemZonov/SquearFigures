package com.jkdajac.squearfigures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_circle.*

class CircleActivity : AppCompatActivity() {

    val Pi = 3.141529


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        btActCirc.setOnClickListener {
            var rad = etActCirc.getText().toString().toInt()
            var squear: Double = 2*Pi * (rad * rad)
            tvActCirc.text = squear.toString()
        }

    }

}




