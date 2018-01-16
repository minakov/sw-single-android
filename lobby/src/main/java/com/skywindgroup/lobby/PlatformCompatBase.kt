package com.skywindgroup.lobby

import android.app.Activity
import android.view.WindowManager

class PlatformCompatBase(private val activity: Activity) : PlatformCompat {

    override fun fullscreen() {
        activity.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }
}
