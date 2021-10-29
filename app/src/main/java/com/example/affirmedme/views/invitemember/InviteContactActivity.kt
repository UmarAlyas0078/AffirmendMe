package com.example.affirmedme.views.invitemember

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import com.example.affirmedme.R
import com.example.affirmedme.databinding.ActivityInviteContactBinding
import com.example.affirmedme.views.main.MainActivity

class InviteContactActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityInviteContactBinding
    private lateinit var host: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityInviteContactBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        host = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        clickListener()
    }

    private fun clickListener() {
        viewBinding.viewMember.btnInviteMember.setOnClickListener {
            host.navController.navigate(R.id.inviteMember)
            viewBinding.viewMember.btnInviteMember.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.bg_invite_btn) )
            viewBinding.viewMember.btnInviteApp.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.bg_invite_bt_inactive) )
            viewBinding.viewMember.btnInviteMember.setTextColor(Color.WHITE)
            viewBinding.viewMember.btnInviteApp.setTextColor(resources.getColor(R.color.main_color))
        }
        viewBinding.viewMember.btnInviteApp.setOnClickListener {
            host.navController.navigate(R.id.inviteApp)
            viewBinding.viewMember.btnInviteApp.setTextColor(Color.WHITE)
            viewBinding.viewMember.btnInviteMember.setTextColor(resources.getColor(R.color.main_color))
            viewBinding.viewMember.btnInviteMember.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.bg_invite_bt_inactive) )
            viewBinding.viewMember.btnInviteApp.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.bg_invite_btn) )
        }
        viewBinding.btnInvite.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}