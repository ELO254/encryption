package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var tencrypt:TextView
    private lateinit var tword:EditText
    private lateinit var tkey:EditText
    private lateinit var ebutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tencrypt = findViewById(R.id.txtencrypt)
        tword = findViewById(R.id.edtword)
        tkey = findViewById(R.id.edtkey)
        ebutton = findViewById(R.id.btnencrypt)

        ebutton.setOnClickListener{
            encrypt()
        }


    }

    private fun encrypt() {
        var word = tword.text.toString()
        var key = tkey.text.toString().toInt()

        var result = StringBuilder()

        for (char in word){

            var f = char.toInt()
            var v = f - key
            var t = v.toChar()
            var en = result.append(t)

            tencrypt.text = en





        }
    }
}