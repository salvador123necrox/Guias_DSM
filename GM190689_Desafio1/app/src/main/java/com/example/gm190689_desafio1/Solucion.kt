package com.example.gm190689_desafio1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Solucion : AppCompatActivity() {
    lateinit var label:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solucion)
        var empleado=intent.getStringExtra("empleado")
        var codigo=intent.getStringExtra("codigo")
        var venta=intent.getStringExtra("venta")
        var porcentaje=intent.getIntExtra("Porcentaje",0)
        var comision=intent.getIntExtra("comision",0)
        var mes=intent.getStringExtra("Mes")
        label=findViewById(R.id.infor)
        label.setText("El empleado ${empleado} con codigo ${codigo} hizo una venta en el mes de ${mes} con un total de $${venta} por lo cual le corresponde recibir un porcentaje de" +
                " ${porcentaje}% lo cual genera una ganancia por comision de $${comision}")
    }
}