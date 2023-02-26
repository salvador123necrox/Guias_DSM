package com.example.gm190689_desafio1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var nombre:EditText
    lateinit var contra:EditText
    lateinit var btnlog:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nombre=findViewById(R.id.nombretxt)
        contra=findViewById(R.id.contratxt)
        btnlog=findViewById(R.id.btnlogin)
        btnlog.setOnClickListener{

            if(nombre.text.toString()== "" && contra.text.toString()=="")
            {
                Toast.makeText(applicationContext, "Ingrese el usuario y contraseña",Toast.LENGTH_SHORT).show()
            }
            else
            {
                val usuario = getSharedPreferences("usuarios", Context.MODE_PRIVATE)
                var abrir = usuario.edit()
                abrir.putString("nombre",nombre.text.toString())
                abrir.commit()
                val menus = Intent(this,Menu::class.java)
                startActivity(menus)
            }
        }
    }
}