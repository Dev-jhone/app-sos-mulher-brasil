package com.jonathan.appsosmulherbrasil

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class SobreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configurarTela()

        setContentView(R.layout.activity_sobre)

        configurarBotao()
    }

    private fun configurarTela() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView)
            .hide(WindowInsetsCompat.Type.statusBars())
    }

    private fun configurarBotao() {
        findViewById<Button>(R.id.btnVoltar).setOnClickListener {
            finish()
        }
    }
}