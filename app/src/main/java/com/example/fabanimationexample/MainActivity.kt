package com.example.fabanimationexample

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fabanimationexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var fabdurum=false

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

       binding.mainactivtyobject=this
    }

    fun alarmfab(){

    }
    fun camerafab(){

    }

    fun  addfab(){
       buttonanimator()
    }


    fun buttonanimator(){
        if(fabdurum){

            val r=ObjectAnimator.ofFloat(binding.fabmain,"rotation",45.0F,0.0F)
            val scalexalarmfab=ObjectAnimator.ofFloat(binding.fabalarm,"scaleX",1.0F,0.0F)
            val scaleyalarmfab=ObjectAnimator.ofFloat(binding.fabalarm,"scaleY",1.0F,0.0F)
            val scalexcamerafab=ObjectAnimator.ofFloat(binding.fabcamera,"scaleX",1.0F,0.0F)
            val scaleycamerafab=ObjectAnimator.ofFloat(binding.fabcamera,"scaleY",1.0F,0.0F)


            val many=AnimatorSet().apply {
                duration=500

                playTogether(r,scalexcamerafab,scaleycamerafab,scalexalarmfab,scaleyalarmfab)
            }

            many.start()

            fabdurum=false

        }else{

            val r=ObjectAnimator.ofFloat(binding.fabmain,"rotation",0.0F,45.0F)
            val scalexalarmfab=ObjectAnimator.ofFloat(binding.fabalarm,"scaleX",0.0F,1.0F)
            val scaleyalarmfab=ObjectAnimator.ofFloat(binding.fabalarm,"scaleY",0.0F,1.0F)
            val scalexcamerafab=ObjectAnimator.ofFloat(binding.fabcamera,"scaleX",0.0F,1.0F)
            val scaleycamerafab=ObjectAnimator.ofFloat(binding.fabcamera,"scaleY",0.0F,1.0F)


            val many=AnimatorSet().apply {
                duration=500

                playTogether(r,scalexcamerafab,scaleycamerafab,scalexalarmfab,scaleyalarmfab)
            }

            many.start()

            fabdurum=true


        }


    }
}