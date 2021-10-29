package com.example.affirmedme.views.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.affirmedme.R
import com.example.affirmedme.views.intro.OnboardActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        listener()
    }

    private fun listener() {
        Handler(mainLooper).postDelayed({
            startActivity(Intent(this@SplashActivity, OnboardActivity::class.java))
            finish()
        }, 3000)
    }
}