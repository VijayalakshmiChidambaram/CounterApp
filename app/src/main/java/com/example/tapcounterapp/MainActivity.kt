package com.example.tapcounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterBtn = findViewById<Button>(R.id.counter_button)
        val tapCounterView = findViewById<TextView>(R.id.counter_textView)
        //No need upgrade button as one both does both single and two increment
        val upgradeBtn = findViewById<Button>(R.id.Upgrade_counter_btn)
        var counter = 0
        var incrementBy = 1
        counterBtn.setOnClickListener {
            Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter = counter+incrementBy
            tapCounterView.text = counter.toString()
            if(counter >= 10)
            {
                //upgradeBtn.visibility = View.VISIBLE
                    counterBtn.setText("Add2")
                incrementBy = 2;
            }
        }


    }
}