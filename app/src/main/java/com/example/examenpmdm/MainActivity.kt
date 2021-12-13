package com.example.examenpmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton = findViewById<Button>(R.id.button)
        val toast = Toast.makeText(applicationContext, R.string.mensaje, Toast.LENGTH_SHORT)

        boton.setOnClickListener{
            toast.show()

        }

        for (i in 100..0) {
            Log.d("Estado", i.toString())
        }

    }

    override fun onResume() {
        super.onResume()
        Log.d("Estado","onResume")
    }


}