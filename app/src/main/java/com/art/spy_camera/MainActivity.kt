package com.art.spy_camera

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var appNameTextView: TextView
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        appNameTextView = findViewById(R.id.textView)
        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        editText = findViewById(R.id.editText)

        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                appNameTextView.text = "Spy Camera"
            } else {
                appNameTextView.text = "Привет, " + editText.text
            }
            appNameTextView.text = "Фото сохранено"
        }


    }
}