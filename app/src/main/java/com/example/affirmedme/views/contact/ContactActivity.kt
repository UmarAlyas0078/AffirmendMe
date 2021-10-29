package com.example.affirmedme.views.contact

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.affirmedme.databinding.ActivityContactBinding
import com.example.affirmedme.views.invitemember.InviteContactActivity

class ContactActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        clickListener()
    }

    private fun clickListener() {
        viewBinding.btnAllow.setOnClickListener {
            startActivity(Intent(this@ContactActivity, InviteContactActivity::class.java))
            finish()
        }
    }

}