package com.example.lection5

import android.content.IntentFilter
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //private val appReceiver: MyCustomReceiver = MyCustomReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val intentFilter: IntentFilter = IntentFilter()
        //this.registerReceiver(appReceiver, intentFilter)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        val button: Button = findViewById<Button>(R.id.myButton)
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            button.textSize = 21F
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            button.textSize = 10F
        }
    }
}