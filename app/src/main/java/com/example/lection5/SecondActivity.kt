package com.example.lection5

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class SecondActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_act)

        Toast.makeText(this, "Second created!", Toast.LENGTH_SHORT).show()
    }

}