package com.example.affirmedme.views.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmedme.R
import com.example.affirmedme.databinding.ActivitySiginBinding
import com.example.affirmedme.databinding.ActivitySignupBinding
import com.example.affirmedme.views.sigin.SiginActivity

class SignupActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        clickListener()
    }

    private fun clickListener() {
        viewBinding.lblSighnIn.setOnClickListener {
            startActivity(Intent(this@SignupActivity,SiginActivity::class.java))
            finish()
        }
    }
}