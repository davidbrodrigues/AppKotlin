package com.example.ciclodevida

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {
    var startTime = System.nanoTime()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onCreate")
    }

    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onStart")
    }

    override fun onResume() {
        super.onResume()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onResume")
    }

    override fun onPause() {
        super.onPause()

        // Imprimimos en la ventana del "Logcat"
        val estimatedTime = System.nanoTime() - startTime
        val t = estimatedTime/1000000
        Log.d("Estado","onPause $t")
    }
    override fun onStop() {
        super.onStop()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onDestroy")
    }
}