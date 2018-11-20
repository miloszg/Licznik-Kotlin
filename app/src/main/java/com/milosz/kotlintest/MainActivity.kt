package com.milosz.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var licznik: Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView=findViewById<TextView>(R.id.textView)
        var dodaj=findViewById<Button>(R.id.dodaj)
        var reset=findViewById<Button>(R.id.reset)
    }
    fun dodaj(view: View){
        licznik++
        textView.text = licznik.toString()
    }
    fun reset(view: View){
        licznik=0
        textView.text = licznik.toString()
    }
}
