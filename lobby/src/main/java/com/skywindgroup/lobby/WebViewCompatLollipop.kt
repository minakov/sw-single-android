package com.skywindgroup.lobby

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.os.Environment
import android.support.annotation.RequiresApi
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView

@SuppressLint("SetJavaScriptEnabled")
@RequiresApi(Build.VERSION_CODES.KITKAT)
class WebViewCompatLollipop(context: Context) : WebViewCompat {
    override val view: View by lazy {
        webView
    }
    private val webView: WebView by lazy {
        if (BuildConfig.DEBUG) {
            WebView.setWebContentsDebuggingEnabled(true)
        }
        WebView(context).apply {
            setInitialScale(0)
            isVerticalScrollBarEnabled = false

            settings.run {
                //We don't save any form data in the application
                saveFormData = false
                savePassword = false

                allowUniversalAccessFromFileURLs = true
                mediaPlaybackRequiresUserGesture = false

                javaScriptEnabled = true
                domStorageEnabled = true

                databaseEnabled = true

                cacheMode = WebSettings.LOAD_DEFAULT
                setAppCacheEnabled(true)
                setAppCachePath(Environment.getDownloadCacheDirectory().path)
            }
        }
    }

    override fun loadUrl(url: String) {
        webView.loadUrl(url)
    }
}
