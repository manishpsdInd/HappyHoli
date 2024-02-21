package com.androindian.happyholi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var tvOne: TextView
    private lateinit var tvTwo: TextView
    private lateinit var tvThree: TextView
    private lateinit var llParent: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Native Mobile - Lets Learn Android")

        tvOne = findViewById(R.id.tvOne)
        tvTwo = findViewById(R.id.tvTwo)
        tvThree = findViewById(R.id.tvThree)
        llParent = findViewById(R.id.llParent)

        setUpClickListener()
    }

    private fun setUpClickListener() {
        tvOne.setOnClickListener{
            Toast.makeText(this@MainActivity, "Text " + tvOne.text + " clicked", Toast.LENGTH_SHORT).show()
        }
        tvTwo.setOnClickListener{
            Toast.makeText(this@MainActivity, "Text " + tvTwo.text + " clicked", Toast.LENGTH_SHORT).show()
        }
        tvThree.setOnClickListener{
            Toast.makeText(this@MainActivity, "Text " + tvThree.text + " clicked", Toast.LENGTH_SHORT).show()
        }
    }

}