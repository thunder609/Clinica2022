package com.example.firebaseloginkotlin

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.widget.Toast
import android.view.animation.Animation
import com.example.firebaseloginkotlin.databinding.ActivitySplashAnimationBinding

class SplashAnimation : AppCompatActivity() {
    private lateinit var binding: ActivitySplashAnimationBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.spAnimation.playAnimation()



        binding.spAnimation.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {}
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationCancel(animation: Animator?) {}


            override fun onAnimationEnd(animation: Animator?) {
                val intent = Intent(applicationContext, SignInActivity::class.java)
                intent.flags=Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
                finish()





            }
        })


    }
}


