package com.turtlecode.youtube

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun togosecond_activity (view:View) {
        val name    = name.text.toString()
        val surname = surname.text.toString()
        val age     = age.text.toString()
        val country = country.text.toString()
        val message = "Name :${name} \nSurname :${surname} \nAge :${age} \nCountry :${country}\n"

        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}