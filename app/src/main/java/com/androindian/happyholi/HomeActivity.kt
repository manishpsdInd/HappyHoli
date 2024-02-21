package com.androindian.happyholi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {

    private lateinit var edtNameText: String
    private lateinit var edtName: TextView
    private lateinit var btnSubmit: Button
    private lateinit var btnHelp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        edtName = findViewById(R.id.edtName)
        btnSubmit = findViewById(R.id.btnSubmit)
        btnHelp = findViewById(R.id.btnHelp)

        setUpClickListener()
    }

    private fun setUpClickListener() {

        btnSubmit.setOnClickListener{
            edtName.clearFocus()
            Utility.hideKeyBoard(this@HomeActivity)
            edtNameText = edtName.text?.trim().toString()
            val regex = "^[A-Za-z\\s]*$".toRegex()

            if (!edtNameText.isNullOrEmpty() && edtNameText.length >= 4 && regex.matches(edtNameText)) {
                redirectToGreetScreen(edtNameText)
            } else {
                edtName.error = getString(R.string.please_enter_a_valid_text)
                Toast.makeText(
                    this@HomeActivity,
                    getString(R.string.please_enter_a_valid_text), Toast.LENGTH_SHORT
                ).show()
            }
        }

        btnHelp.setOnClickListener{
            redirectToHelp()
        }
    }

    private fun redirectToGreetScreen(edtNameText: String) {
        val intent = Intent(this@HomeActivity, GreetingsActivity::class.java)
        intent.putExtra("uname",edtNameText)
        startActivity(intent);
    }

    private fun redirectToHelp() {
        startActivity(Intent(this@HomeActivity, MainActivity::class.java)
            .apply {
        })
    }

}