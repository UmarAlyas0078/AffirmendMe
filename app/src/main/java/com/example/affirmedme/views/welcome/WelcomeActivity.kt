package com.example.affirmedme.views.welcome

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.affirmedme.databinding.ActivityWelcomeBinding
import com.example.affirmedme.views.auth.AuthActivity

class WelcomeActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityWelcomeBinding.inflate(layoutInflater);
        setContentView(viewBinding.root)
        clickListener()
    }

    private fun clickListener() {
        viewBinding.btnNext.setOnClickListener {
            startActivity(Intent(this@WelcomeActivity, AuthActivity::class.java))
            finish()
        }
    }
}