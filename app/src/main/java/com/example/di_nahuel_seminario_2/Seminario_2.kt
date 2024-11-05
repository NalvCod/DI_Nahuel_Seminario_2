package com.example.di_nahuel_seminario_2

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toBitmap
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Seminario_2 : AppCompatActivity() {

    private lateinit var carta1 : ImageView
    private lateinit var carta2 : ImageView
    private lateinit var carta3 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seminario2)

        carta1 = findViewById(R.id.Carta1)
        carta2 = findViewById(R.id.Carta2)
        carta3 = findViewById(R.id.Carta3)

        var esTrasera = true

        carta1.setOnClickListener{
            if (esTrasera){
                carta1.setImageResource(R.drawable.c4)
                esTrasera = false

            }else {
                carta1.setImageResource(R.drawable.c1)
                esTrasera = true
            }
        }

        carta2.setOnClickListener{
            if (esTrasera){
                carta2.setImageResource(R.drawable.c2)
                esTrasera = false
                //aaaa

            }else {
                carta2.setImageResource(R.drawable.c1)
                esTrasera = true
            }
        }

        carta3.setOnClickListener{
            if (esTrasera){
                carta3.setImageResource(R.drawable.c3)
                esTrasera = false

            }else {
                carta3.setImageResource(R.drawable.c1)
                esTrasera = true
            }
        }


    }
}