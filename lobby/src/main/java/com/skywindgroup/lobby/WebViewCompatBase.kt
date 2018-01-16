package com.skywindgroup.lobby

import android.content.Context
import android.view.View
import org.xwalk.core.XWalkView

class WebViewCompatBase(context: Context) : WebViewCompat {
    override val view: View by lazy {
        webView
    }
    private val webView: XWalkView by lazy {
        XWalkView(context)
    }

    override fun loadUrl(url: String) {
        webView.loadUrl(url)
    }
}
