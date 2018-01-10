package com.skywindgroup.lobby

import android.app.Activity
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.ViewGroup
import android.widget.FrameLayout

class GameActivity : Activity() {
    private val platform by lazy {
        Platform(this)
    }
    private val view by lazy {
        WebViewEngine(this).view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        platform.fullscreen()
        super.onCreate(savedInstanceState)

        setContentView(view.apply {
            id = R.id.web_view
            layoutParams = FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            setBackgroundColor(Color.BLACK)
        })
        val uri = Uri.parse("http://gc.gaming.skywindgroup.com/oldmasterq/latest/index.html")
                .buildUpon()
                .appendQueryParameter("url", "http://api.cd.d.skywind-tech.com:4000/casino/game2")
                .appendQueryParameter("language", "en")
                .appendQueryParameter("playmode", "fun")
                .appendQueryParameter("merch_login_url", "http://api.cd.d.skywind-tech.com:8001/")
                .appendQueryParameter("history", "1")
                .appendQueryParameter("history_url", "http://gc.gaming.skywindgroup.com/gamehistory/2.7.5/index.html")
                .build()
        view.loadUrl(uri.toString())
    }
}
