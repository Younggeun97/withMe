package com.example.withme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.withme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    implements OnMapReadyCallback {
//        private GoogleMap mMap
//    };

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}