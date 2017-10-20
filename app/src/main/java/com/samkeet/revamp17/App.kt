package com.samkeet.revamp17

import android.app.Application
import android.graphics.Typeface

/**
 * Created by knightshade on 10/20/17.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initTypeface()
    }

    private fun initTypeface() {
        canaroExtraBold = Typeface.createFromAsset(assets, CANARO_EXTRA_BOLD_PATH)

    }

    companion object {
        private val CANARO_EXTRA_BOLD_PATH = "fonts/canaro_extra_bold.otf"
        lateinit var canaroExtraBold: Typeface
    }
}