package com.example.a27012022

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mc = findViewById<CheckedTextView>(R.id.mlekoc)
        val cc = findViewById<CheckedTextView>(R.id.cukierc)
        val chc = findViewById<CheckedTextView>(R.id.chlebc)
        val maslo = findViewById<CheckedTextView>(R.id.masloc)
        val herbata = findViewById<CheckedTextView>(R.id.mlekoc)

        findViewById<Button>(R.id.button).setOnClickListener {
            if(mc.isChecked){
                findViewById<TextView>(R.id.lzt).text.toString() + "\n Mleko"
            }
            else if(cc.isChecked){
                findViewById<TextView>(R.id.lzt).text.toString() + "\n Cukier"
            }
            else if(chc.isChecked){
                findViewById<TextView>(R.id.lzt).text.toString() + "\n Chleb"
            }
            else if(maslo.isChecked){
                findViewById<TextView>(R.id.lzt).text.toString() + "\n Masło"
            }
            else if(herbata .isChecked){
                findViewById<TextView>(R.id.lzt).text.toString() + "\n Herbata"
            }
        }
    }
}