package com.example.affirmedme.views.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import com.example.affirmedme.R
import com.example.affirmedme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var host: NavHostFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        host = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        setDrawer()
        clickListener()
    }

    private fun clickListener() {
        viewBinding.menueItem.lblCircle.setOnClickListener {
            if (viewBinding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
                viewBinding.drawerLayout.closeDrawer(GravityCompat.START)
            }
            host.navController.navigate(R.id.requestFragment)
        }
    }

    private fun setDrawer() {
        viewBinding.viewAppBar.imgMenue.setOnClickListener {
            viewBinding.drawerLayout.openDrawer(GravityCompat.START)
        }
    }
}