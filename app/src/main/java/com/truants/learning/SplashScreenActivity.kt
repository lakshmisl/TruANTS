package com.truants.learning

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN){
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        val backgroundImage:ImageView = findViewById(R.id.logo)
        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.splash_animation)
        backgroundImage.startAnimation(slideAnimation)
        Handler().postDelayed({
            val intent =Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}