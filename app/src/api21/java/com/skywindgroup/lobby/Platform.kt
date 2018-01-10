package com.skywindgroup.lobby

import android.app.Activity
import android.os.Build
import android.view.WindowManager

class Platform(val activity: Activity) {
    private var immersiveMode: Boolean = false

    fun fullscreen() {
        immersiveMode = true
    }
}
