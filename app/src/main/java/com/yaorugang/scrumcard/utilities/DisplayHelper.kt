package com.yaorugang.scrumcard.utilities

import android.graphics.Color
import android.view.View
import android.view.Window
import android.view.WindowManager

class DisplayHelper {

    companion object {
        /**
         *  This has to be called before setcontentview().
         *  And in the xml layout, need to set android:fitsSystemWindows = true
         */
        fun showTransparentStatusBar(window: Window) {
            window.apply {
                decorView.systemUiVisibility =
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN // fullscreen with status bar
                clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                statusBarColor = Color.TRANSPARENT
            }
        }
    }
}