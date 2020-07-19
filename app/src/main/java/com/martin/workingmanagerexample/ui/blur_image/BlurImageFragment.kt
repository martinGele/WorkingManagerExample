package com.martin.workingmanagerexample.ui.blur_image

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.martin.workingmanagerexample.R

class BlurImageFragment : Fragment() {

    companion object {
        fun newInstance() = BlurImageFragment()
    }

    private lateinit var viewModel: BlurImageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.blur_image_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BlurImageViewModel::class.java)
        // TODO: Use the ViewModel
    }

}