package com.eman.challenge.presentation.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.eman.challenge.R
import com.eman.challenge.presentation.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        dogBlurImageView.setBlur(5)

        Handler().postDelayed({
            openMain()
            finish()
        }, 2500)
    }

    fun openMain() {
        val mIntent = Intent(this, MainActivity::class.java)
        startActivity(mIntent)
    }
}