package ru.startandroid.develop.activityandfragmentlifecallbacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MY_LOG", "onCreate - ACTIVITY ONE")
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MY_LOG", "onStart - ACTIVITY ONE")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MY_LOG", "onResume - ACTIVITY ONE")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MY_LOG", "onRestart - ACTIVITY ONE")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MY_LOG", "onRestoreInstanceState - ACTIVITY ONE")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MY_LOG", "onPause - ACTIVITY ONE")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MY_LOG", "onStop - ACTIVITY ONE")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("MY_LOG", "onSaveInstanceState - ACTIVITY ONE")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MY_LOG", "onDestroy - ACTIVITY ONE")
    }
}