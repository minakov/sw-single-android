package com.skywindgroup.lobby

import android.view.View

interface WebViewCompat {
    val view: View

    fun loadUrl(url: String)
}