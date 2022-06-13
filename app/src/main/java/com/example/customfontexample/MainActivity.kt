package com.example.customfontexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.my_text_view).typeface = ResourcesCompat.getFont(this, R.font.best)
        findViewById<TextView>(R.id.my_text_view).setTextSize(TypedValue.COMPLEX_UNIT_SP, 50.toFloat())
    }
}
