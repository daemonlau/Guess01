package com.liu.guess01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "secret: "+secretNumber.secret)
    }

    fun check(view:View){
        val n = number.text.toString().toInt()
        println("number: $n")
        Log.d("MainActivity","number:" + n)
        if (secretNumber.validate(n)<0){
            Toast.makeText(this, "Bigger", Toast.LENGTH_LONG).show()
        } else if(secretNumber.validate(n)>0){
            Toast.makeText(this, "Smaller", Toast.LENGTH_LONG).show()
        }
    }
}