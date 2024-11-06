package com.example.di_nahuel_seminario_2

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Seminario_3 : AppCompatActivity() {
    private lateinit var semaforo : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seminario3)
        semaforo = findViewById(R.id.semaforo)

        var contador = 0

        object : CountDownTimer(5000, 1000){

            override fun onTick(millisUntilFinished: Long) {
                contador++
                if (contador ==3 ){
                    semaforo.setImageResource(R.drawable.semaforito2)
                }
                if (contador == 4){
                    semaforo.setImageResource(R.drawable.semaforito3)
                }
            }

            override fun onFinish() {
                semaforo.setImageResource(R.drawable.semaforito1)
            }
        }.start()

    }
}