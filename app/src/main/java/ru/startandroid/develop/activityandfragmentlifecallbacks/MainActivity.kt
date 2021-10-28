package ru.startandroid.develop.activityandfragmentlifecallbacks

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MY_LOG", "onCreate - ACTIVITY")
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container_view_tag) as NavHostFragment
        navHostFragment.findNavController()
    }

    override fun onStart() {
        super.onStart()
        Log.i("MY_LOG", "onStart - ACTIVITY")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MY_LOG", "onResume - ACTIVITY")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MY_LOG", "onRestart - ACTIVITY")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.i("MY_LOG", "onSaveInstanceState - ACTIVITY")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("MY_LOG", "onRestoreInstanceState - ACTIVITY")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MY_LOG", "onPause - ACTIVITY")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MY_LOG", "onStop - ACTIVITY")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MY_LOG", "onDestroy - ACTIVITY")
    }
}