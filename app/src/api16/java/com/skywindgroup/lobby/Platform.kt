package com.skywindgroup.lobby

import android.app.Activity
import android.os.Build
import android.view.WindowManager

class Platform(val activity: Activity) {
    private var immersiveMode: Boolean = false

    fun fullscreen() {
        if ((Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)) {
            immersiveMode = true
        } else {
            activity.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }
    }
}
