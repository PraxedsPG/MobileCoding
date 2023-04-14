package com.view

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.Final.Agenda
import com.example.exercitape.R
import com.example.exercitape.databinding.ActivityHomeBinding
import com.example.exercitape.databinding.ActivityMainBinding

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        val nome = intent.extras?.getString("nome")

        binding.txtNomeUsuario.text = "Bem-vindo(a), $nome"

        binding.btAgendar.setOnClickListener {
            irParaAgenda()
        }
    }

    private fun irParaAgenda() {
        val Agenda = Intent(this, Agenda::class.java)
        startActivity(Agenda)
    }
}