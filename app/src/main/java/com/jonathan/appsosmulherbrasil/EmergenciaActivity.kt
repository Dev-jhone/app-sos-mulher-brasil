package com.jonathan.appsosmulherbrasil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class EmergenciaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configurarTela()

        setContentView(R.layout.activity_emergencia)

        configurarBotoes()
    }

    private fun configurarTela() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView)
            .hide(WindowInsetsCompat.Type.statusBars())
    }

    private fun configurarBotoes() {
        findViewById<Button>(R.id.btn190).setOnClickListener {
            ligar("190")
        }

        findViewById<Button>(R.id.btn180).setOnClickListener {
            ligar("180")
        }

        findViewById<Button>(R.id.btn192).setOnClickListener {
            ligar("192")
        }

        findViewById<Button>(R.id.btnVoltar).setOnClickListener {
            finish()
        }
    }

    private fun ligar(numero: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = "tel:$numero".toUri()
        }
        startActivity(intent)
    }
}