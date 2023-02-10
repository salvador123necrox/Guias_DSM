package com.example.myapplicationpractica03dsm104

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.tabs.TabLayout.Tab

private lateinit var txtNumber1: EditText
private lateinit var txtNumber2: EditText
private lateinit var btnSumar: Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(MiLifeCycleObserver())
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()

        txtNumber1 = findViewById<EditText>(R.id.txtNumber1)
        txtNumber2 = findViewById<EditText>(R.id.txtNumber2)
        btnSumar = findViewById<Button>(R.id.btnSumar)

        btnSumar.setOnClickListener(){
            var resultado: Int
            var Number1 = txtNumber1.text.toString().trim().toInt()
            var Number2 = txtNumber2.text.toString().trim().toInt()
            resultado = Number1 + Number2
            Log.d(TAG, "El resultado es: ${resultado}")
        }
    }

    override fun onStart(){
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume(){
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause(){
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop(){
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart(){
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy(){
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }
}