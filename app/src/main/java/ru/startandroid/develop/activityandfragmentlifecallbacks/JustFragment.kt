package ru.startandroid.develop.activityandfragmentlifecallbacks

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.startandroid.develop.activityandfragmentlifecallbacks.databinding.JustFragmentLayoutBinding

class JustFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("MY_LOG", "onAttach - FRAGMENT")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MY_LOG", "onCreate - FRAGMENT")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("MY_LOG", "onCreateView - FRAGMENT")
        val binding = JustFragmentLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("MY_LOG", "onViewCreated - FRAGMENT")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MY_LOG", "onStart - FRAGMENT")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MY_LOG", "onResume - FRAGMENT")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("MY_LOG", "onViewStateRestored - FRAGMENT")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MY_LOG", "onPause - FRAGMENT")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MY_LOG", "onStop - FRAGMENT")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MY_LOG", "onSaveInstanceState - FRAGMENT")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("MY_LOG", "onDestroyView - FRAGMENT")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MY_LOG", "onDestroy - FRAGMENT")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("MY_LOG", "onDetach - FRAGMENT")
    }
}