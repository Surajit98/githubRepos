package com.sd.app.di


import com.sd.app.ui.repo_activity.ReposViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { ReposViewModel(get()) }

}