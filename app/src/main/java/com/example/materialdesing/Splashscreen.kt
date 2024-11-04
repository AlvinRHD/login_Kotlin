package com.example.materialdesing

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import android.view.WindowInsets
import android.widget.LinearLayout
import android.widget.TextView
import com.example.materialdesing.databinding.ActivitySplashscreenBinding

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class Splashscreen : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent =Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }
}