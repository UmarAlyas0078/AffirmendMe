package com.example.affirmedme.views.notification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmedme.R
import com.example.affirmedme.databinding.ActivityAuthBinding
import com.example.affirmedme.databinding.ActivityNotificationBinding
import com.example.affirmedme.views.sigin.SiginActivity
import com.example.affirmedme.views.welcome.WelcomeActivity

class NotificationActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityNotificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        clickListener()
    }

    private fun clickListener() {
        viewBinding.btnNext.setOnClickListener {
            startActivity(Intent(this@NotificationActivity, SiginActivity::class.java))
            finish()
        }
    }
}