package com.matheusvillela.tide.app.android

import android.os.Build
import com.matheusvillela.tide.app.shared.presentation.deps.Platform

class AndroidPlatform : Platform {
    override fun invoke() = "Android ${Build.VERSION.SDK_INT}"
}