package com.skywindgroup.app.single

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.skywindgroup.lobby.GameActivityDelegate

class MainActivity : AppCompatActivity() {
    private val delegate by lazy {
        GameActivityDelegate(this, BuildConfig.GAME_URL)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        delegate.onCreate()
    }
}
