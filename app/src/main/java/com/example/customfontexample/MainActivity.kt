package com.example.customfontexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView.typeface = ResourcesCompat.getFont(this, R.font.best)
        myTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 50.toFloat())

    }
}
