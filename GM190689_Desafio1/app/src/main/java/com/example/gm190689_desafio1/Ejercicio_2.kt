package com.example.gm190689_desafio1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.pow
import java.lang.Math.sqrt
import kotlin.math.roundToInt

class Ejercicio_2 : AppCompatActivity() {
    lateinit var a1:EditText
    lateinit var b1:EditText
    lateinit var c1:EditText
    lateinit var cuadra:Button
    lateinit var label: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)
        a1=findViewById(R.id.atxt)
        b1=findViewById(R.id.btxt)
        c1=findViewById(R.id.ctxt)
        label=findViewById(R.id.respuesta)
        cuadra=findViewById(R.id.btncalcuadra)
        cuadra.setOnClickListener{
            if(a1.text.toString() == "" || b1.text.toString() == "" || c1.text.toString()=="")
            {
                Toast.makeText(applicationContext,"Ingrese todos los coeficientes",Toast.LENGTH_SHORT).show()
            }
            else
            {
                var a = a1.text.toString().toInt()
                var b = b1.text.toString().toInt()
                var c = c1.text.toString().toInt()
                var x1:Double= 0.0
                var x2:Double= 0.0
                var radicando = b*b - 4*a*c
                var denominador = 2*a
                if (radicando<0)
                {
                    Toast.makeText(applicationContext,"No tiene solucion en los reales",Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                if (denominador == 0)
                {
                    Toast.makeText(applicationContext,"Es indeterminado ya que no se puede dividir nada entre cero",Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                x1= ((-b+sqrt(radicando.toDouble()))/denominador)
                x2= ((-b-sqrt(radicando.toDouble()))/denominador)
                label.setText("El primer valor que hace cero la ecuacion es: ${x1} y el segundo valor que hace cero la ecuacion es: ${x2} ")
            }
        }
    }
}