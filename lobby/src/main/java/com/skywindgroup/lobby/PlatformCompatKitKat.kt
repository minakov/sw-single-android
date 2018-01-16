package com.skywindgroup.lobby

import android.app.Activity

class PlatformCompatKitKat(val activity: Activity) : PlatformCompat {
    private var immersiveMode: Boolean = false

    override fun fullscreen() {
        immersiveMode = true
    }
}
