package com.example.formulariofilm

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.formulariofilm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.btnSave.setOnClickListener {
            val myIntent = Intent(this, FichaActivity::class.java)
            myIntent.putExtra("titulo", b.etTitulo.text)
            myIntent.putExtra("year", b.sYear)

            startActivity(myIntent)
        }

    }
}