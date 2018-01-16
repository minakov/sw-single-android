package com.skywindgroup.lobby

import android.app.Activity
import android.graphics.Color
import android.view.ViewGroup
import android.widget.FrameLayout

class GameActivityDelegate(private val activity: Activity, private val gameUrl: String) {
    private val platform by lazy {
        Platform(activity)
    }
    private val engine by lazy {
        WebViewEngine(activity)
    }

    fun onCreate() {
        platform.fullscreen()
        activity.setContentView(engine.view.apply {
            id = R.id.web_view
            layoutParams = FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            setBackgroundColor(Color.BLACK)
        })
        engine.loadUrl(gameUrl)
    }
}
