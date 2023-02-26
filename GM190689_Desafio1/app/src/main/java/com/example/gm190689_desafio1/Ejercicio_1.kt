package com.example.gm190689_desafio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Ejercicio_1 : AppCompatActivity() {
    var mesarray = arrayOf("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto","Septiembre", "Octubre", "Noviembre", "Diciembre")
    lateinit var empleado:EditText
    lateinit var codigo:EditText
    lateinit var venta:EditText
    lateinit var calcu:Button
    lateinit var fecha:Spinner
    var ventaMes = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)
        var meses = ArrayAdapter(this,android.R.layout.simple_spinner_item,mesarray)
        meses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        empleado=findViewById(R.id.empleadotxt)
        codigo=findViewById(R.id.codigotxt)
        venta=findViewById(R.id.ventatxt)
        calcu=findViewById(R.id.btncal)
        fecha=findViewById(R.id.cmbfecha)
        fecha.adapter=meses

        fecha.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                ventaMes= mesarray[position]
            }
        }
        calcu.setOnClickListener{

            if (venta.text.toString()!="" && empleado.text.toString()!="" && codigo.text.toString()!="" && ventaMes!="")
            {
                var comision = 0
                var percent=0
                var cantventa = venta.text.toString().toInt()
                if (cantventa < 500)
                {
                    percent=0
                    comision=0
                }
                else if (cantventa >= 500 && cantventa < 1000)
                {
                    percent=5
                    comision= (cantventa*0.05).toInt()
                }
                else if (cantventa >= 1000 && cantventa < 2000)
                {
                    percent=10
                    comision= (cantventa*0.1).toInt()
                }
                else if (cantventa >= 2000 && cantventa < 3000)
                {
                    percent=15
                    comision= (cantventa*0.15).toInt()
                }
                else if (cantventa >= 3000 && cantventa < 4000)
                {
                    percent=20
                    comision= (cantventa*0.2).toInt()
                }
                else if (cantventa >= 4000)
                {
                    percent=30
                    comision= (cantventa*0.3).toInt()
                }
                val sol = Intent(this,Solucion::class.java).apply {
                    putExtra("empleado",empleado.text.toString())
                    putExtra("codigo",codigo.text.toString())
                    putExtra("venta",venta.text.toString())
                    putExtra("comision",comision)
                    putExtra("Porcentaje",percent)
                    putExtra("Mes",ventaMes)
                }
                startActivity(sol)
            }
            else
            {
                Toast.makeText(applicationContext,"No puede dejar campos vacios",Toast.LENGTH_SHORT).show()
            }
        }

    }
}