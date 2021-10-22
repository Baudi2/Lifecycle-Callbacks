package ru.startandroid.develop.activityandfragmentlifecallbacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d("MY_LOG", "onCreate - ACTIVITY TWO")
    }


    override fun onStart() {
        super.onStart()
        Log.d("MY_LOG", "onStart - ACTIVITY TWO")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MY_LOG", "onResume - ACTIVITY TWO")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MY_LOG", "onRestart - ACTIVITY TWO")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MY_LOG", "onRestoreInstanceState - ACTIVITY TWO")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MY_LOG", "onPause - ACTIVITY TWO")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MY_LOG", "onStop - ACTIVITY TWO")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("MY_LOG", "onSaveInstanceState - ACTIVITY TWO")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MY_LOG", "onDestroy - ACTIVITY TWO")
    }
}