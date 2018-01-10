package com.skywindgroup.lobby

import android.annotation.SuppressLint
import android.content.Context
import android.os.Environment
import android.webkit.WebSettings
import android.webkit.WebView

@SuppressLint("SetJavaScriptEnabled")
class WebViewEngine(private val context: Context) {
    val view: WebView by lazy {
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
}
