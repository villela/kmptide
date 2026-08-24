package com.matheusvillela.tide.app.desktop

import com.matheusvillela.tide.app.shared.presentation.deps.Platform

class DesktopPlatform : Platform {
    override fun invoke() = "Desktop"
}