package com.jkdajac.squearfigures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_squear.*

class SquearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_squear)

        btActSq.setOnClickListener {
           var length : Double = etActSq.getText().toString().toDouble()
            var sqr : Double = length * length
            tvActSq.text = "Area of squear : " + sqr.toDouble()
        }
    }
}