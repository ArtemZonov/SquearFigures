package com.jkdajac.squearfigures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rectangle.*
import kotlinx.android.synthetic.main.activity_squear.*

class RectangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        btActRec.setOnClickListener {
            var length : Double = etActRecLength.getText().toString().toDouble()
            var width : Double = etActRecWidth.getText().toString().toDouble()
            var rect : Double = length * width
            tvActRec.text = "Area of rectangle : " + rect.toDouble()
        }
    }
}