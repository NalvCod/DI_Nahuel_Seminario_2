package com.example.di_nahuel_seminario_2

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Seminario_1 : AppCompatActivity() {
    private lateinit var numero : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sem_1_layout)

        numero = findViewById(R.id.contador)
        var cambiarActividad = Intent(this, BOOM::class.java)
        var num = numero.text.toString().toLong()

        object : CountDownTimer(num*1000, 1000){
            var fontsize = numero.textSize.toFloat()
            override fun onTick(millisUntilFinished: Long) {
                fontsize += 30f
                num--
                numero.text = num.toString()
                numero.textSize = fontsize
            }

            override fun onFinish() {
                startActivity(cambiarActividad)
            }

        }.start()

    }



}
