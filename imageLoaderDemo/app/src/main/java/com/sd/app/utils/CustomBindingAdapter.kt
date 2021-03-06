package com.sd.app.utils

import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter
import com.sd.app.R
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import org.koin.core.KoinComponent
import org.koin.core.get

object CustomBindingAdapter : KoinComponent {

    var picasso: Picasso = get()

    @JvmStatic
    @BindingAdapter(value = ["url", "progressBar"])
    fun loadImage(view: ImageView?, url: String?, progressBar: ProgressBar) {
        url?.apply {
            progressBar.visibility = View.VISIBLE
            picasso.load(this).error(R.mipmap.not_available).into(view, object : Callback {
                override fun onSuccess() {
                    progressBar.visibility = View.GONE
                }

                override fun onError() {
                    progressBar.visibility = View.GONE
                }

            })
        }

    }
}