package com.example.affirmedme.views.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.affirmedme.databinding.ActivityAuthBinding
import com.example.affirmedme.views.notification.NotificationActivity

class AuthActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        clickListener()
    }

    private fun clickListener() {
        viewBinding.edtPhone.setOnClickListener {
            startActivity(Intent(this@AuthActivity, NotificationActivity::class.java))
            finish()
        }
    }
}