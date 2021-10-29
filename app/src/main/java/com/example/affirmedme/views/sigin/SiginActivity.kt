package com.example.affirmedme.views.sigin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.affirmedme.databinding.ActivitySiginBinding
import com.example.affirmedme.views.contact.ContactActivity
import com.example.affirmedme.views.signup.SignupActivity

class SiginActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivitySiginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySiginBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        clickListener()
    }

    private fun clickListener() {
        viewBinding.lblSignUp.setOnClickListener {
            startActivity(Intent(this@SiginActivity, SignupActivity::class.java))
            finish()
        }
        viewBinding.viewSignIn.btnNext.setOnClickListener {
            startActivity(Intent(this@SiginActivity, ContactActivity::class.java))
            finish()
        }
    }
}