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

        var esTrasera1 = true
        var esTrasera2 = true
        var esTrasera3 = true

        carta1.setOnClickListener{
            if (esTrasera1){
                carta1.setImageResource(R.drawable.c4)
                esTrasera1 = false

            }else {
                carta1.setImageResource(R.drawable.c1)
                esTrasera1 = true
            }
        }

        carta2.setOnClickListener{
            if (esTrasera2){
                carta2.setImageResource(R.drawable.c2)
                esTrasera2 = false
                //aaaa

            }else {
                carta2.setImageResource(R.drawable.c1)
                esTrasera2 = true
            }
        }

        carta3.setOnClickListener{
            if (esTrasera3){
                carta3.setImageResource(R.drawable.c3)
                esTrasera3 = false

            }else {
                carta3.setImageResource(R.drawable.c1)
                esTrasera3 = true
            }
        }


    }
}