package ru.startandroid.develop.activityandfragmentlifecallbacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MY_LOG", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MY_LOG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MY_LOG", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MY_LOG", "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("MY_LOG", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MY_LOG", "onRestoreInstanceState")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MY_LOG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MY_LOG", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MY_LOG", "onDestroy")
    }
}