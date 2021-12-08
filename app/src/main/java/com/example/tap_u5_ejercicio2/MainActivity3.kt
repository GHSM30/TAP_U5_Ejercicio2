package com.example.tap_u5_ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        /*
        el oyente del boton
        la concatenacion
        asignacion de la concatenacion a la etiqueta
         */

        button3.setOnClickListener(){
            var valor1 = texto1.text.toString()
            var valor2 = texto2.text.toString()

            var resultado = valor1+""+valor2
            textView.setText(resultado)
            texto1.setText("")
            texto2.setText("")

        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Funsioona para agregar al activity un menu contextual
        this.menuInflater.inflate(R.menu.menuoculto , menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.regresarmenu ->{
                finish()
            }

            R.id.acercademenu ->{
                Toast.makeText(this, "C GUILLERMO", Toast.LENGTH_LONG)
                    .show()
            }

        }
        return true
    }
}