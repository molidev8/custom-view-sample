package com.molidev8.customswitchsamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.molidev8.customswitchsamples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(ActivityMainBinding.inflate(layoutInflater)) {
            setContentView(root)
        }
    }

}