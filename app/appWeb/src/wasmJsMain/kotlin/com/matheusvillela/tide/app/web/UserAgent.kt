package com.matheusvillela.tide.app.web

internal actual fun getUserAgent(): String = js("window.navigator.userAgent")