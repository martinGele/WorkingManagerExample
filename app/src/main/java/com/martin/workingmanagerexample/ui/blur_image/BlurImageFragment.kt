package com.martin.workingmanagerexample.ui.blur_image

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.martin.workingmanagerexample.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class BlurImageFragment : Fragment() {


    val viewModel: BlurImageViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.blur_image_fragment, container, false)
    }


}