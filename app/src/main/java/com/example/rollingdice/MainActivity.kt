package com.example.rollingdice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnroll.setOnClickListener {
            imagedice.setImageResource(getRandomImage())
        }
    }

    private fun getRandomImage(): Int {
        val  randomInt=java.util.Random().nextInt(6)+1

        return when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
    }
}
