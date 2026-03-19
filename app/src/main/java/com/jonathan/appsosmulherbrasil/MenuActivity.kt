package com.jonathan.appsosmulherbrasil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configurarTela()

        setContentView(R.layout.activity_menu)

        configurarBotoes()
    }

    private fun configurarTela() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView)
            .hide(WindowInsetsCompat.Type.statusBars())
    }

    private fun configurarBotoes() {
        findViewById<Button>(R.id.btnEmergencia).setOnClickListener {
            startActivity(Intent(this, EmergenciaActivity::class.java))
        }

        findViewById<Button>(R.id.btnApoio).setOnClickListener {
            startActivity(Intent(this, ApoioActivity::class.java))
        }

        findViewById<Button>(R.id.btnDireitos).setOnClickListener {
            startActivity(Intent(this, DireitosActivity::class.java))
        }

        findViewById<Button>(R.id.btnSobre).setOnClickListener {
            startActivity(Intent(this, SobreActivity::class.java))
        }
    }
}