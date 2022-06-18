package com.example.togglebuttonkot15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    lateinit var mToggleButton: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mToggleButton=findViewById(R.id.toggleButton)
        mToggleButton.setOnClickListener {
            if (mToggleButton.isChecked){
              Toast.makeText(this@MainActivity,"toggle button checked:-${  mToggleButton.text}",Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this@MainActivity,"toggle button unchecked:-${  mToggleButton.text}",Toast.LENGTH_LONG).show()
            }
        }
    }
}