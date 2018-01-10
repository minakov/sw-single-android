package com.skywindgroup.lobby

import android.content.Context
import org.xwalk.core.XWalkView

class WebViewEngine(private val context: Context) {
    val view: XWalkView by lazy {
        XWalkView(context)
    }
}
