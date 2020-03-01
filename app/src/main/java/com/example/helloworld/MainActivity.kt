package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        android.util.Log.d("MainActivity", "hello world");
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_save)
        button.setOnClickListener(listener)
    }

    val listener = object:View.OnClickListener {
        override fun onClick(v: View?) {
            Toast.makeText(this@MainActivity, "clicked!", Toast.LENGTH_SHORT).show()

            val countTextView = findViewById<TextView>(R.id.count)
            var count = countTextView.text.toString().toInt()
            count++
            countTextView.text = count.toString()
        }
    }
}
