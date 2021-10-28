package ru.startandroid.develop.activityandfragmentlifecallbacks

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.startandroid.develop.activityandfragmentlifecallbacks.databinding.SecondFragmentLayoutBinding

class SecondFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.v("MY_LOG", "onAttach - SECOND FRAGMENT")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("MY_LOG", "onCreate - SECOND FRAGMENT")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.v("MY_LOG", "onCreateView - SECOND FRAGMENT")
        val binding = SecondFragmentLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.v("MY_LOG", "onViewCreated - SECOND FRAGMENT")
    }

    override fun onStart() {
        super.onStart()
        Log.v("MY_LOG", "onStart - SECOND FRAGMENT")
    }

    override fun onResume() {
        super.onResume()
        Log.v("MY_LOG", "onResume - SECOND FRAGMENT")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.v("MY_LOG", "onViewStateRestored - SECOND FRAGMENT")
    }

    override fun onPause() {
        super.onPause()
        Log.v("MY_LOG", "onPause - SECOND FRAGMENT")
    }

    override fun onStop() {
        super.onStop()
        Log.v("MY_LOG", "onStop - SECOND FRAGMENT")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.v("MY_LOG", "onSaveInstanceState - SECOND FRAGMENT")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.v("MY_LOG", "onDestroyView - SECOND FRAGMENT")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("MY_LOG", "onDestroy - SECOND FRAGMENT")
    }

    override fun onDetach() {
        super.onDetach()
        Log.v("MY_LOG", "onDetach - SECOND FRAGMENT")
    }
}