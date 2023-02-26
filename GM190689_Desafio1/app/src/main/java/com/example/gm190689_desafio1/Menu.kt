package com.example.gm190689_desafio1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Menu : AppCompatActivity() {
    lateinit var ejer1:Button
    lateinit var ejer2:Button
    lateinit var cerrar:Button
    lateinit var label1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        ejer1=findViewById(R.id.btnejer1)
        ejer2=findViewById(R.id.btnejer2)
        cerrar=findViewById(R.id.btncerrar)
        label1=findViewById(R.id.codeusua)

        val usuarios = getSharedPreferences("usuarios", Context.MODE_PRIVATE)
        var user = usuarios.getString("nombre","nick")

        label1.setText("Hola ${user}, dirijase al ejercicio que desea realizar")

        ejer1.setOnClickListener {
            val ejerci1 = Intent(this, Ejercicio_1::class.java)
            startActivity(ejerci1)
        }
        ejer2.setOnClickListener {
            val ejerci2 = Intent(this, Ejercicio_2::class.java)
            startActivity(ejerci2)
        }
        cerrar.setOnClickListener{
            val usuario = getSharedPreferences("usuarios", Context.MODE_PRIVATE)
            var abrir = usuario.edit()
            abrir.clear()

            val login = Intent(this, MainActivity::class.java)
            startActivity(login)
        }
    }
}