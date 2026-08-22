package com.matheusvillela.tide.app.web

import com.matheusvillela.tide.app.shared.di.Platform

class WebPlatform : Platform {
    override fun invoke() = "Web - " + getUserAgent()
}