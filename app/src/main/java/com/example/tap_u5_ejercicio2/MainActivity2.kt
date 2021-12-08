package com.example.tap_u5_ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button2.setOnClickListener(){
            var valor1 = numero1.text.toString().toInt() //integer.parce.int
            var valor2 = numero2.text.toString().toInt()
            var calcular = spinner.selectedItemPosition
            var resultado = 0

            when(calcular){
                0 ->{resultado = valor1 + valor2}
                1 ->{resultado = valor1 - valor2}
                2 ->{resultado = valor1 * valor2}
                3 ->{resultado = valor1 / valor2}
            }

            AlertDialog.Builder(this)
                .setTitle("RESULTADO")
                .setMessage("SU CALCULO ARROJO ${resultado}")
                .setPositiveButton("OK",{d,i -> d.dismiss()})
                .show()
        }

        button2.setOnClickListener(){
            //regresar
            finish()
        }
    }
}