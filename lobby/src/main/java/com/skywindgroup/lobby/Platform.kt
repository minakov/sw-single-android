package com.skywindgroup.lobby

import android.app.Activity
import android.os.Build

class Platform(activity: Activity) {
    private val impl: PlatformCompat by lazy {
        if ((Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)) {
            PlatformCompatKitKat(activity)
        } else {
            PlatformCompatBase(activity)
        }
    }

    fun fullscreen() {
        impl.fullscreen()
    }
}
