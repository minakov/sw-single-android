package com.skywindgroup.lobby

import android.content.Context
import android.os.Build
import android.view.View

class WebViewEngine(context: Context) {
    private val impl: WebViewCompat by lazy {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            WebViewCompatLollipop(context)
        } else {
            WebViewCompatBase(context)
        }
    }
    val view: View by lazy {
        impl.view
    }

    fun loadUrl(url: String) {
        impl.loadUrl(url)
    }
}
