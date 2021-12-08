package com.example.tap_u5_ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main4.*
import java.io.OutputStreamWriter

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        guardar.setOnClickListener(){
            if(guardarEnMemoriaInterna(contenidoArchivo.text.toString()) == true){
                AlertDialog.Builder(this)
                    .setTitle("Exito")
                    .setMessage("Se guardo en archivo correctamente")
                    .setPositiveButton("OK", {d,i -> d.dismiss()})
                    .show()
            }
        }
    }



    fun guardarEnMemoriaInterna(conten : String) : Boolean{
        if(conten.isEmpty()){
            Toast.makeText(this, "ERROR DEBES PONER UN ENUNCIADO A GUARDAR", Toast.LENGTH_LONG)
            return false
        }

        try{
            var flujoSalida = OutputStreamWriter( openFileOutput("almacen.txt", MODE_PRIVATE) )

            flujoSalida.write(conten)// C guarda
            flujoSalida.flush()// forza a que el Android Guarde sobre el archivo
            flujoSalida.close()//Cerrando el archivo

            return true
        }catch(io : Exception){
            AlertDialog.Builder(this)
                .setTitle("ERROR")
                .setMessage("NO SE PUDO GUARDAR EN ARCHIVO")
                .show()
            return false
        }

    }
}