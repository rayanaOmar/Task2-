package com.example.rayanatask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var nameText: EditText
    lateinit var mobileText: EditText
    lateinit var okBtu: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //the EditText:
        nameText = findViewById(R.id.name)
        mobileText = findViewById(R.id.mobile)

        //The Button
        okBtu = findViewById(R.id.okButton)

        //Store the text into list to display
        val list = listOf(nameText.text, mobileText.text)

        //toa button --> use show toast to display the list
        okBtu.setOnClickListener {
            Toast.makeText(applicationContext,list.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}