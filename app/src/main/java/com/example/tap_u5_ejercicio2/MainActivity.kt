package com.example.tap_u5_ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuprincipal.setOnItemClickListener { parent, view, position, id ->
            //En java switch-case
            //como se hace en kotlin?
            when(position){
                0 -> {
                    //invocar un activiti desde el principal
                    //el objeto Intent invoca un activity
                    val ventana2 = Intent(this,MainActivity2 ::class.java)
                    startActivity(ventana2)
                }
                1 -> {
                    val ventana3 = Intent(this,MainActivity3 :: class.java)
                    startActivity(ventana3)
                }
                2 -> {val ventana4 = Intent(this,MainActivity4 :: class.java)
                    startActivity(ventana4)
                }
                3 -> {val ventana5 = Intent(this, MainActivity5 :: class.java)
                    startActivity(ventana5)
                }
                4 -> {mensaje()}
                5 -> {cerrar()}
            }
        }

    }

    //construccion de un metodo
    //java public void mensaje(tipo parametro)

    fun mensaje(){
        AlertDialog.Builder(this)
            .setTitle("Atencion")
            .setMessage("C RESERVADOS GUILLERMO")
            .setPositiveButton("OK", {d,i -> d.dismiss()})
            .show()
    }

    fun cerrar(){
        finish()
    }
    /*metodo con retorno
    fun otroMetodo() : Int {
        var retorno = 9
        return retorno
    }
    */

}