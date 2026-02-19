package com.example.helloworld

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this)
        textView.text = "Hello World!"
        textView.gravity = Gravity.CENTER
        textView.textSize = 30f
        
        setContentView(textView)
    }
}
