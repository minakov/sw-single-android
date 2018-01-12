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
        view.loadUrl(BuildConfig.GAME_URL)
    }
}
