package com.jonathan.appsosmulherbrasil

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class DireitosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configurarTela()

        setContentView(R.layout.activity_direitos)

        configurarBotoes()
    }

    private fun configurarTela() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView)
            .hide(WindowInsetsCompat.Type.statusBars())
    }

    private fun configurarBotoes() {
        findViewById<Button>(R.id.btnLei).setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.planalto.gov.br/ccivil_03/_ato2004-2006/2006/lei/l11340.htm")
            )
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnVoltar).setOnClickListener {
            finish()
        }
    }
}