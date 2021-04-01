package com.example.demo_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hideSwitch =findViewById<Switch>(R.id.hideImgSwitch)
        val image=findViewById<ImageView>(R.id.imageView)
        hideSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (!isChecked){
                image.visibility=View.VISIBLE
            }else{
                image.visibility=View.INVISIBLE
            }
        }
    }

    fun chooseTurtle(view: View) {
        val chooseText = findViewById<TextView>(R.id.chooseTextView)
        val image = findViewById<ImageView>(R.id.imageView)
        when(view.id){
            R.id.donBtn ->{
                chooseText.text = "You have chosen Don!"
                image.setImageResource(R.drawable.tmntdon)
            }
            R.id.mikeBtn ->{
                chooseText.text = "You have chosen Mike!"
                image.setImageResource(R.drawable.tmntmike)
            }
            R.id.raphBtn ->{
                chooseText.text = "You have chosen Raph!"
                image.setImageResource(R.drawable.tmntraph)
            }
            R.id.leoBtn ->{
                chooseText.text = "You have chosen Leo!"
                image.setImageResource(R.drawable.tmntleo)
            }
        }
        val hideSwitch = findViewById<Switch>(R.id.hideImgSwitch)
        if(hideSwitch.isChecked){
            image.visibility = View.INVISIBLE
        }
        else{
            image.visibility = View.VISIBLE
        }
    }

}