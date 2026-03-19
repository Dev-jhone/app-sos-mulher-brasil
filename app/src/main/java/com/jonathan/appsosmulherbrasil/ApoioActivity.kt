package com.jonathan.appsosmulherbrasil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class ApoioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configurarTela()

        setContentView(R.layout.activity_apoio)

        configurarBotoes()
    }

    private fun configurarTela() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView)
            .hide(WindowInsetsCompat.Type.statusBars())
    }

    private fun configurarBotoes() {
        findViewById<Button>(R.id.btnDelegacia).setOnClickListener {
            abrirMapa("delegacia da mulher")
        }

        findViewById<Button>(R.id.btnCras).setOnClickListener {
            abrirMapa("CRAS")
        }

        findViewById<Button>(R.id.btn180).setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = "tel:180".toUri()
            }
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnVoltar).setOnClickListener {
            finish()
        }
    }

    private fun abrirMapa(busca: String) {
        val uri = "geo:0,0?q=$busca".toUri()
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}