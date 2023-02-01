package com.example.discusionresultados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var operador1: EditText
lateinit var operador2: EditText
lateinit var calcular: Button
lateinit var resultado: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        operador1 = findViewById(R.id.TxtOperador1)
        operador2 = findViewById(R.id.TxtOperador2)
        calcular = findViewById(R.id.BtnCalcular)
        resultado = findViewById(R.id.LblResultado)

        calcular.setOnClickListener{
            var oper1: Float = operador1.text.toString().toFloat()
            var oper2: Float = operador2.text.toString().toFloat()
            var suma: Float = oper1 + oper2
            resultado.setText("Resultado: "+ suma.toString())
        }
    }
}