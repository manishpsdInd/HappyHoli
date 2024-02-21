package com.androindian.happyholi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class GreetingsActivity : AppCompatActivity()  {

    private lateinit var greet: ImageView
    private var name: String? = null
    private lateinit var tvBestWishes: TextView

    private val images = listOf<Int>(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.j,
        R.drawable.k,
        R.drawable.l,
        R.drawable.m,
        R.drawable.n,
        R.drawable.o,
        R.drawable.p
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)

        greet = findViewById(R.id.ivGreeting)
        tvBestWishes = findViewById(R.id.tvBestWishes)

        setGreetUI()
    }

    private fun setGreetUI()    {
        val randomImage = images.random()
        greet.setImageResource(randomImage)

        tvBestWishes.text = "Happy Holi " + intent.getStringExtra("uname")
    }

}