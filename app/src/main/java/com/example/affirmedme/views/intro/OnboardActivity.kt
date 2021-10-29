package com.example.affirmedme.views.intro

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.affirmedme.databinding.ActivityOnboardBinding
import com.example.affirmedme.views.fragments.introfragments.Intro1Fragment
import com.example.affirmedme.views.fragments.introfragments.Intro2Fragment
import com.example.affirmedme.views.fragments.introfragments.Intro3Fragment
import com.example.affirmedme.views.onboardadapter.IntroSliderAdapter
import com.example.affirmedme.views.splash.SplashActivity
import com.example.affirmedme.views.welcome.WelcomeActivity

class OnboardActivity : AppCompatActivity() {
    private val fragmentList = ArrayList<Fragment>()
    private lateinit var viewBinding: ActivityOnboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityOnboardBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val adapter = IntroSliderAdapter(this)
        viewBinding.imgSlider.adapter = adapter
        fragmentList.addAll(
            listOf(
                Intro1Fragment(), Intro2Fragment(), Intro3Fragment()
            )
        )
        adapter.setFragmentList(fragmentList)
        viewBinding.indicatorLayout.setIndicatorCount(adapter.itemCount)
        viewBinding.indicatorLayout.selectCurrentPosition(0)
        registerListeners()
    }

    private fun registerListeners() {
        viewBinding.imgSlider.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                viewBinding.indicatorLayout.selectCurrentPosition(position)
                if (position < fragmentList.lastIndex) {
                    viewBinding.tvSkip.visibility = View.VISIBLE
                    viewBinding.btnNext.text = "Next"
                } else {
                    viewBinding.tvSkip.visibility = View.GONE
                    viewBinding.btnNext.text = "Get Started"
                }
            }
        })
        viewBinding.tvSkip.setOnClickListener {
            startActivity(Intent(this, SplashActivity::class.java))
            finish()
        }
        viewBinding.btnNext.setOnClickListener {
            val position = viewBinding.imgSlider.currentItem
            if (position < fragmentList.lastIndex) {
                viewBinding.imgSlider.currentItem = position + 1
            } else {
                startActivity(Intent(this, WelcomeActivity::class.java))
                finish()
            }
        }
    }
}