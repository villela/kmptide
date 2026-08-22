package com.matheusvillela.tide.app.web

import kotlinx.browser.window

internal actual fun getUserAgent(): String {
    return window.navigator.userAgent
}
