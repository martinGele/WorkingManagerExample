package com.martin.workingmanagerexample.koin_injections

import com.martin.workingmanagerexample.ui.blur_image.BlurImageFragment
import com.martin.workingmanagerexample.ui.blur_image.BlurImageViewModel
import com.martin.workingmanagerexample.ui.select_image.SelectImageFragment
import com.martin.workingmanagerexample.ui.select_image.SelectImageViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AllInjections {


    // just declare it
    val myModule = module {
        /**
         * blur image fragment with view model
         */
        single { BlurImageFragment() }
        viewModel { BlurImageViewModel() }
        /**
         * select image fragment with view model
         */
        single { SelectImageFragment() }
        viewModel { SelectImageViewModel() }


    }
}