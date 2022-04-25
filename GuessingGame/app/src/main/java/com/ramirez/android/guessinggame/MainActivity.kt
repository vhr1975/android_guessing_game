package com.ramirez.android.guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //on create function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //on click button function and pass in super class of View for all widgets
    fun leftButtonClick(view:View)
    {
        // variable and call findViewById to access its View object and pass in the widgets unique id
        val leftButton = findViewById<Button>(R.id.btnLeft)
        // update the text on the button widget
        leftButton.text = "1"
        // TODO  increment the value after every click
    }

}