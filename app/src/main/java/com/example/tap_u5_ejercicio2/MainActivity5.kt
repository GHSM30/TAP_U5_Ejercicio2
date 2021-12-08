package com.example.tap_u5_ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main5.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        abrir.setOnClickListener(){
            if(abrirMemoriaInterna() == true){
                AlertDialog.Builder(this)
                    .setMessage("SE RECUPERO LA DATA")
                    .show()
            }
        }

        regresarArchivo2.setOnClickListener(){
            finish()
        }

    }

    fun abrirMemoriaInterna() : Boolean{
        var data=""
        try{
            var flujoEntrada = BufferedReader(InputStreamReader(openFileInput("almacen.txt")))
            data = flujoEntrada.readLine()
            resultado.setText(data)
            flujoEntrada.close()
            return true
        }catch (io : IOException){
            AlertDialog.Builder(this)
                .setMessage("ERROR NO se pudo abrir archivo")
                .setTitle("No se pudo guardar el archivo")
                .show()
            return false
        }
    }
}