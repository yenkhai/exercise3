package com.example.exercise3

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            var age:Int = 0
            var male:Int = 0
            var smoker:Int = 0

            when(spinner.selectedItemPosition) {
                0 -> age = 60
                1 -> {
                    age = 70
                    if (radioButton.isChecked) male = 50
                    if (radioButton2.isChecked) smoker = 100
                }
                2 -> {
                    age = 90
                    if (radioButton.isChecked) male = 100
                    if (radioButton2.isChecked) smoker = 150
                }
                3 -> {
                    age = 120
                    if (radioButton.isChecked) male = 150
                    if (radioButton2.isChecked) smoker = 200
                }
                4 -> {
                    age = 150
                    if (radioButton.isChecked) male = 200
                    if (radioButton2.isChecked) smoker = 250
                }
                5 -> {
                    age = 150
                    if (radioButton.isChecked) male = 200
                    if (radioButton2.isChecked) smoker = 300
                }
            }

            textView3.setText("Insurance Premium: RM${age + male + smoker}")
        }

        Reset.setOnClickListener() {
            textView3.setText("Insurence Premium: ")
        }
    }
}
