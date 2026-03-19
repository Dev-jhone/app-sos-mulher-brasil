package com.jonathan.appsosmulherbrasil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()

        super.onCreate(savedInstanceState)

        configurarTela()

        setContentView(R.layout.activity_main)

        configurarBotoes()
    }

    private fun configurarTela() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView)
            .hide(WindowInsetsCompat.Type.statusBars())
    }

    private fun configurarBotoes() {
        findViewById<Button>(R.id.btnIniciar).setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }
    }
}