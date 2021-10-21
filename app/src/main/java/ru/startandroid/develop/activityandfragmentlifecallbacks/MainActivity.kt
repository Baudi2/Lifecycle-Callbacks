package ru.startandroid.develop.activityandfragmentlifecallbacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add(R.id.fragment_container_view_tag, JustFragment())
            }
        }
        Log.d("MY_LOG", "onCreate - ACTIVITY")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MY_LOG", "onStart - ACTIVITY")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MY_LOG", "onResume - ACTIVITY")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MY_LOG", "onRestart - ACTIVITY")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("MY_LOG", "onSaveInstanceState - ACTIVITY")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MY_LOG", "onRestoreInstanceState - ACTIVITY")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MY_LOG", "onPause - ACTIVITY")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MY_LOG", "onStop - ACTIVITY")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MY_LOG", "onDestroy - ACTIVITY")
    }
}